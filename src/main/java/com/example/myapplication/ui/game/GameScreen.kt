package com.example.myapplication.ui.game

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.data.UserAnswer
import com.example.myapplication.ui.theme.Correct
import com.example.myapplication.ui.theme.Incorrect


@Composable
fun GameScreen(
    dificultad: String,
    categoria: String,
    navigateToScreen3: (Int, List<UserAnswer>) -> Unit
) {

    val vm: GameViewModel = viewModel(factory = GameViewModelFactory(dificultad, categoria))


    val ronda by vm.ronda.collectAsStateWithLifecycle()
    val juegoTerminado by vm.juegoTerminado.collectAsStateWithLifecycle()
    val numTemp by vm.progreso.collectAsStateWithLifecycle()
    val selectedAnswer by vm.selectedAnswer.collectAsStateWithLifecycle()
    val userAnswers by vm.userAnswers.collectAsStateWithLifecycle()
    val score by vm.puntosScore.collectAsStateWithLifecycle()

    val animatedProgress by animateFloatAsState(
        targetValue = numTemp, animationSpec = androidx.compose.animation.core.tween(50)
    )

    LaunchedEffect(dificultad, categoria) {
        vm.chequearNuevosDatos(dificultad, categoria)
    }
    LaunchedEffect(juegoTerminado) {
        if (juegoTerminado && vm.getEnunciado() != "Cargando...") {
            navigateToScreen3(score, userAnswers)
            vm.resetear()
        }
    }

    Column(
        Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.surface,
                        MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f)
                    )
                )
            ),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(48.dp))

        // Header with Score and Round
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Pregunta ${ronda + 1}/10",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
            )
            Text(
                "Score: $score",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )
        }

        Spacer(Modifier.height(16.dp))

        LinearProgressIndicator(
            progress = { animatedProgress },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .height(8.dp)
                .clip(RoundedCornerShape(4.dp)),
            color = if (animatedProgress > 0.8f) Incorrect else MaterialTheme.colorScheme.primary,
            trackColor = MaterialTheme.colorScheme.surfaceVariant
        )

        Spacer(Modifier.height(32.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(
                vm.getEnunciado(),
                modifier = Modifier.padding(24.dp),
                style = MaterialTheme.typography.headlineSmall.copy(
                    lineHeight = 32.sp,
                    textAlign = TextAlign.Center
                )
            )
        }

        Spacer(Modifier.height(32.dp))

        Column(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            val opciones = vm.getOpciones()
            val correctAnswerIndex = vm.getCorrectAnswerIndex()
            
            opciones.forEachIndexed { index, opcion ->
                AnswerButton(
                    text = opcion,
                    isSelected = selectedAnswer == index,
                    showFeedback = selectedAnswer != null,
                    isCorrectIndex = index == correctAnswerIndex,
                    onClick = { vm.nextRound(index) }
                )
            }
        }
    }
}

@Composable
fun AnswerButton(
    text: String,
    isSelected: Boolean,
    showFeedback: Boolean,
    isCorrectIndex: Boolean,
    onClick: () -> Unit
) {
    val backgroundColor by animateColorAsState(
        targetValue = when {
            showFeedback && isCorrectIndex -> Correct.copy(alpha = 0.2f)
            showFeedback && isSelected && !isCorrectIndex -> Incorrect.copy(alpha = 0.2f)
            isSelected -> MaterialTheme.colorScheme.primaryContainer
            else -> MaterialTheme.colorScheme.surface
        }
    )

    val borderColor by animateColorAsState(
        targetValue = when {
            showFeedback && isCorrectIndex -> Correct
            showFeedback && isSelected && !isCorrectIndex -> Incorrect
            isSelected -> MaterialTheme.colorScheme.primary
            else -> MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)
        }
    )

    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.outlinedButtonColors(containerColor = backgroundColor),
        border = androidx.compose.foundation.BorderStroke(2.dp, borderColor),
        enabled = !showFeedback
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                textAlign = TextAlign.Center
            ),
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}
