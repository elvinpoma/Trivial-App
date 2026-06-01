package com.example.myapplication.data

import kotlinx.serialization.Serializable

@Serializable
data class UserAnswer(
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    val userAnswerIndex: Int
)
