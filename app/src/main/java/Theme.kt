import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import com.ndejje.momocalc.ui.MoMoTypography


val LightColorScheme = lightColorScheme(
    primary         = NavyBlue,
    onPrimary       = White,
    secondary       = BrandGold,
    onSecondary     = NavyBlueDark,
    background      = LightGrey,
    onBackground    = DarkSurface,
    surface         = White,
    onSurface       = DarkSurface,
    error           = ErrorRed,
    onError         = OnErrorWhite
)

@Composable
fun MoMoAppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography  = MoMoTypography,   // from Module 5 Typography.kt
        shapes      = MoMoShapes,        // from Part D below
        content     = content
    )
}

 val DarkColorScheme = darkColorScheme(
    primary         = BrandGold,        // gold becomes the hero in dark mode
    onPrimary       = NavyBlueDark,
    secondary       = NavyBlue,
    onSecondary     = White,
    background      = DarkBackground,
    onBackground    = OnDarkText,
    surface         = DarkSurface,
    onSurface       = OnDarkText,
    error           = ErrorRed,
    onError         = OnErrorWhite
)