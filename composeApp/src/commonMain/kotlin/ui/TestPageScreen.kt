package ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import ui.base.BaseScreen

class TestPageScreen : BaseScreen() {
    @Composable
    override fun ContentWithNavigator(navigator: Navigator) {
        Surface(Modifier.fillMaxSize(), color = Color.Blue) {
            Column {
                Text("test compose text", color = Color.Red,
                    modifier = Modifier.clickable {
                        navigator.pop()
                    })

            }
        }
    }
}