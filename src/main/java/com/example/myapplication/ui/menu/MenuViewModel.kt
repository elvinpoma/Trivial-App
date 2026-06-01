package com.example.myapplication.ui.menu

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class MenuViewModel : ViewModel() {
    val options = listOf("Fácil", "Medio", "Difícil")
    val categorias = listOf("Ofimática","Software","Hardware","Sistemas Operativos","Seguridad","Redes","Bases de Datos","Programación","General")
    var optSelec by mutableStateOf(options[0])
        private set
    var catSelec: String by mutableStateOf(categorias[0])
        private set

    var expandido by mutableStateOf(false)
        private set

    var catexpandido by mutableStateOf(false)
        private set

    fun alExpandir(nuevoVal: Boolean) {
        expandido = nuevoVal
    }
    fun alExpCat(nuevoVal: Boolean){
        catexpandido = nuevoVal
    }

    fun alSelecOpt(NuevaOpt: String) {
        optSelec = NuevaOpt
        expandido = false
    }
    fun alSelCat(nuevoCat: String){
        catSelec = nuevoCat
        catexpandido = false
    }

}