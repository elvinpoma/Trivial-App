package com.example.myapplication.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.myapplication.ui.game.GameScreen
import com.example.myapplication.ui.menu.MenuScreen
import com.example.myapplication.ui.result.ResultScreen
import com.example.myapplication.ui.splash.SplashScreen


@Composable
fun NavigationWrapper() {
    val backStack = rememberNavBackStack(Routes.SplashScreen)
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.SplashScreen> {
                SplashScreen {
                    backStack.removeLastOrNull()
                    backStack.add(Routes.MenuScreen)
                }
            }
            entry<Routes.MenuScreen> {
                MenuScreen() { dificultad, categoria ->
                    backStack.add(
                        Routes.GameScreen(
                            dificultad, categoria
                        )
                    )
                }
            }
            entry<Routes.GameScreen> { it ->
                GameScreen(
                    it.dificultad, it.categoria
                ) { score, mistakes -> backStack.add(Routes.ResultScreen(score, mistakes)) }
            }
            entry<Routes.ResultScreen> { key ->
                ResultScreen(key.score, key.mistakes) {
                    backStack.clear()
                    backStack.add(Routes.MenuScreen)
                }
            }
        })
}
