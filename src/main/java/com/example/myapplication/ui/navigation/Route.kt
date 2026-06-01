package com.example.myapplication.ui.navigation

import androidx.navigation3.runtime.NavKey
import com.example.myapplication.data.UserAnswer
import kotlinx.serialization.Serializable


sealed class Routes: NavKey {
    @Serializable
    data object SplashScreen: Routes()
    @Serializable
    data object MenuScreen: Routes()
    @Serializable
    data class GameScreen(val dificultad : String, val categoria: String): Routes()
    @Serializable
    data class ResultScreen(val score: Int, val mistakes: List<UserAnswer>): Routes()
}
