package com.example.tutorial4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorial4.ui.theme.PhilipsTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val painter = painterResource(id=R.drawable.auga)
            val descriptor = "Kapoios pou krataei auga"
            val title = "Kapoios krataei ayga"
            Box (modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(16.dp))
            {
                ImageCard(
                    painter = painter, contentDescription = descriptor, title = title
                )
            }


        }
    }
}
@Composable
fun ImageCard(
    painter: Painter,
    contentDescription:String,
    title: String,
    modifier: Modifier=Modifier
) {
    Card (modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 15.dp)
    )
    {
        Box(modifier = Modifier.height(200.dp))
        {
            Image(
                painter = painter,
                contentDescription= contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier=Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                ))
            {

            }
            Box(modifier=Modifier.fillMaxSize().padding(15.dp),
                contentAlignment = Alignment.BottomStart)
            {
                 Text(title, style = TextStyle(Color.Yellow), fontSize = 16.sp)
            }
        }
    }
}
@Preview
@Composable
fun PreviewCard()
{
    val painter = painterResource(id=R.drawable.auga)
    val descriptor = "Kapoios pou krataei auga"
    val title = "Kapoios krataei ayga"
    Box (modifier = Modifier
        .fillMaxWidth(0.5f)
        .padding(16.dp))
    {
        ImageCard(
            painter = painter, contentDescription = descriptor, title = title
        )
    }

}