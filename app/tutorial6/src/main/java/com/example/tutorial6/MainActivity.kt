package com.example.tutorial6

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.tutorial6.ui.theme.PhilipsTutorialTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val color = remember { mutableStateOf(Color.Yellow) }

            Column ( Modifier.fillMaxSize()){
                ColorBox(
                Modifier.weight(1f).fillMaxSize()
            ){
                    color.value= it
                }
            Box(modifier = Modifier
                .background(color.value)
                .weight(1f)
                .fillMaxSize()
            )
            {

            }
            }

        }
    }
}
@SuppressLint("UnrememberedMutableState")
@Composable
fun ColorBox(modifier: Modifier= Modifier,
             updateColor:(Color) -> Unit
             )
{

    Box(modifier=modifier
        .background(Color.Blue)
        .clickable{
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )

            )
        })
    {

    }
}

