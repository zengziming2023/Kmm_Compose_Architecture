import androidx.compose.ui.window.ComposeUIViewController
import cafe.adriel.voyager.navigator.Navigator
import ui.HomeScreen

fun MainViewController() = ComposeUIViewController { Navigator(HomeScreen()) }  //App()
