package com.example.myapplication.data

data class Pregunta(
    val pregunta: String,
    val opciones: List<String>,
    val respuestaCorrecta: Int,
    val dificultad: String,
    val categoria: String
)