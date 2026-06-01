package com.example.myapplication.ui.game

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class GameViewModelFactory(private val dificultad: String, private val categoria: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            return GameViewModel(dificultad,categoria) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
