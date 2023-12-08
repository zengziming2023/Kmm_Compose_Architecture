package ui

import Greeting
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.base.BaseScreen

class HomeScreen : BaseScreen() {
    @OptIn(ExperimentalResourceApi::class)
    @Composable
    override fun ContentWithNavigator(navigator: Navigator) {
        MaterialTheme {
            var greetingText by remember { mutableStateOf("Hello World!") }
            var showImage by remember { mutableStateOf(false) }
            Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = {
                    greetingText = "Compose: ${Greeting().greet()}"
                    showImage = !showImage
                }) {
                    Text(greetingText)
                }
                Button(onClick = {
                    navigator.push(TestPageScreen())
                    println("click btn..")
                }) {
                    Text("test navigator")
                }
                AnimatedVisibility(showImage) {
                    Image(
                        painterResource("compose-multiplatform.xml"), null
                    )
                }
            }
        }
    }
}