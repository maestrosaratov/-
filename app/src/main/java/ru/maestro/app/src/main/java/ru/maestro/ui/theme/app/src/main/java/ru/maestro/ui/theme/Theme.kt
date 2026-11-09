package ru.maestro.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val MaestroColorScheme = lightColorScheme(
    primary = MaestroBlue,
    background = MaestroWhite,
    surface = MaestroWhite,
    onPrimary = MaestroWhite,
    onBackground = MaestroDark,
    onSurface = MaestroDark
)

@Composable
fun MaestroTheme(content: ) -> Unit {
    MaterialTheme(
        colorScheme = MaestroColorScheme,
        content = content
    )
}
