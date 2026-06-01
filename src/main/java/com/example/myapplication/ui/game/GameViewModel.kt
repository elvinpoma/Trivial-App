package com.example.myapplication.ui.game

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.Pregunta
import com.example.myapplication.data.UserAnswer
import com.example.myapplication.domain.QuestionProvider
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GameViewModel(private var currentDif: String, private var currentCat: String) : ViewModel() {
    private var preguntas: List<Pregunta> = emptyList()

    private val _ronda = MutableStateFlow(0)
    val ronda: StateFlow<Int> = _ronda.asStateFlow()
    
    private val _puntosScore = MutableStateFlow(0)
    val puntosScore: StateFlow<Int> = _puntosScore.asStateFlow()

    private val _juegoTerminado = MutableStateFlow(false)
    val juegoTerminado: StateFlow<Boolean> = _juegoTerminado.asStateFlow()

    private val _progreso = MutableStateFlow(0.0f)
    val progreso: StateFlow<Float> = _progreso.asStateFlow()

    private val _selectedAnswer = MutableStateFlow<Int?>(null)
    val selectedAnswer: StateFlow<Int?> = _selectedAnswer.asStateFlow()

    private val _userAnswers = MutableStateFlow<List<UserAnswer>>(emptyList())
    val userAnswers: StateFlow<List<UserAnswer>> = _userAnswers.asStateFlow()

    private var timerJob: Job? = null
    private val tiempoPorPregunta = 10000L

    fun getEnunciado(): String {
        return if (preguntas.isNotEmpty() && _ronda.value < preguntas.size) {
            preguntas[_ronda.value].pregunta
        } else "Cargando..."
    }

    fun getOpciones(): List<String> {
        return if (preguntas.isNotEmpty() && _ronda.value < preguntas.size) {
            preguntas[_ronda.value].opciones
        } else listOf("", "", "", "")
    }

    fun getCorrectAnswerIndex(): Int {
        return if (preguntas.isNotEmpty() && _ronda.value < preguntas.size) {
            preguntas[_ronda.value].respuestaCorrecta
        } else -1
    }

    private fun startTimer() {
        timerJob?.cancel()
        _progreso.value = 0f
        timerJob = viewModelScope.launch {
            val startTime = System.currentTimeMillis()
            while (System.currentTimeMillis() - startTime < tiempoPorPregunta) {
                val elapsed = System.currentTimeMillis() - startTime
                _progreso.value = elapsed.toFloat() / tiempoPorPregunta
                delay(50)
            }
            _progreso.value = 1.0f
            nextRound(-1)
        }
    }

    fun nextRound(userResposta: Int) {
        if (_juegoTerminado.value || preguntas.isEmpty() || _selectedAnswer.value != null) return
        
        timerJob?.cancel()
        _selectedAnswer.value = userResposta
        
        viewModelScope.launch {
            if (_ronda.value < preguntas.size) {
                val currentPregunta = preguntas[_ronda.value]
                if (userResposta != -1) {
                    if (userResposta == currentPregunta.respuestaCorrecta) {
                        _puntosScore.value++
                    } else {
                        // It was a mistake
                        _userAnswers.value += UserAnswer(
                            currentPregunta.pregunta,
                            currentPregunta.opciones,
                            currentPregunta.respuestaCorrecta,
                            userResposta
                        )
                    }
                } else {
                    // Timeout is also a mistake
                    _userAnswers.value += UserAnswer(
                        currentPregunta.pregunta,
                        currentPregunta.opciones,
                        currentPregunta.respuestaCorrecta,
                        -1
                    )
                }
            }

            delay(1000) // Feedback delay
            
            if (_ronda.value >= preguntas.size - 1) {
                _progreso.value = 1.0f
                _juegoTerminado.value = true
            } else {
                _selectedAnswer.value = null
                _ronda.value++
                startTimer()
            }
        }
    }

    fun chequearNuevosDatos(nuevaDif: String, nuevaCat: String) {
         if (preguntas.isEmpty() || currentDif != nuevaDif || currentCat != nuevaCat || _juegoTerminado.value) {
            timerJob?.cancel()
            timerJob = null
             this.preguntas = emptyList()
            _ronda.value = 0
            _puntosScore.value = 0
            _progreso.value = 0f
            _juegoTerminado.value = false
            _selectedAnswer.value = null
            _userAnswers.value = emptyList()
            currentDif = nuevaDif
            currentCat = nuevaCat
            val nuevas = QuestionProvider().getPregunta(nuevaDif, nuevaCat)
            if (nuevas.isNotEmpty()) {
                this.preguntas = nuevas
                startTimer()
            } else {
                _juegoTerminado.value = false
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        timerJob?.cancel()
    }
    fun resetear (){
        _juegoTerminado.value = false
    }

}
