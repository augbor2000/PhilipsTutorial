package com.example.tutorial8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        Surface(){

            Box {
                Column {
                    DisplayImage()
                    DisplayText()
                }

            }

        }

        }
        }
    }

@Composable
fun DisplayImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.fillMaxWidth()
        )
}

@Composable
fun DisplayText(modifier: Modifier = Modifier) {

        Text(
            "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
            )
        Text("Jetpack Compose is a modern toolkit for building native Android UI. " +
                "Compose simplifies and accelerate UI development on Android with less code," +
                "powerful tools, and intuitive Kotlin APIs.",
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
            )
        Text("In this tutorial, you build a simple UI component with " +
                "declarative function. You call Compose functions to say what elements you " +
                "want and the Compose compiler  does the rest." +
                " Compose is build around Composable functions." +
                " These functions let you define your app\'s UI " +
                "programmatically because they let you describe how it should look and " +
                "provide data dependencies," +
                " rather than focus on the process of the UI\'s construction," +
                "such as initializing an element and then attaching it to a parent." +
                "To create a Composable function, " +
                "you  add the @composable annotation to the function name.",
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Justify
            )

    }



