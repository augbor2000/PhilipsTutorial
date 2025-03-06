package com.example.tutorial11

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard()
            
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {

    Surface (modifier = Modifier
        .fillMaxSize(),
    ){
        Box(modifier = Modifier
            .background(Color(0xD8BEBE94)),
            contentAlignment = Alignment.Center
        ) {
            SetImage()
        }
        Box(
            modifier = Modifier.padding(start = 110.dp, bottom =30.dp),
            contentAlignment = Alignment.BottomStart
        ){
            DisplayContact()
        }
    }

}


@Composable
fun SetImage(modifier: Modifier = Modifier) {

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(120.dp, 120.dp)
                .background(color = Color.Black)
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null
            )
        }
        DisplayImageText(
            stringResource(R.string.jennifer_doe),
            stringResource(R.string.android_developer_extraordinaire)
        )
    }
}

@Composable
fun DisplayImageText(message1: String,message2 : String, modifier: Modifier = Modifier) {
    Text(
        text = message1,
        fontWeight = FontWeight(16),
        fontSize = 50.sp,
        modifier = Modifier
            .padding(6.dp)
    )
    Text(
        text =message2,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = Color(0xFF1B421C),
        modifier = Modifier
            .padding(4.dp)

    )
}
@Composable
fun DisplayContact() {

    Column (modifier = Modifier.padding(bottom = 16.dp)){
        Row (modifier = Modifier.padding(bottom = 8.dp)){
            Icon(imageVector = Icons.Default.Call, contentDescription = null)
            Text(stringResource(R.string.call), modifier = Modifier.padding(start = 18.dp))
        }
        Row (modifier = Modifier.padding(bottom = 8.dp)){
            Icon(imageVector = Icons.Default.Share, contentDescription = null)
            Text(stringResource(R.string.androiddev), modifier = Modifier.padding(start = 18.dp))
        }
        Row (modifier = Modifier.padding(bottom = 8.dp)){
            Icon(imageVector = Icons.Default.Email, contentDescription = null)
            Text(stringResource(R.string.jen_doe_android_com), modifier = Modifier.padding(start = 18.dp))
        }
    }

}