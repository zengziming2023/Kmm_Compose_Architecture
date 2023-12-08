package ui.base

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator

abstract class BaseScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current ?: kotlin.run {
            println("navigator null, return")
            return
        }
        ContentWithNavigator(navigator)
    }

    @Composable
    abstract fun ContentWithNavigator(navigator: Navigator)


}