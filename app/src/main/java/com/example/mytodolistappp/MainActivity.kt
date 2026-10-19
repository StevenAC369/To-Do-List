package com.example.mytodolistappp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.BackgroundModifier

import androidx.glance.text.FontFamily
import com.example.mytodolistappp.ui.theme.MyToDoListApppTheme
import com.google.firebase.annotations.concurrent.Background
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyToDoListApppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        "Hello $name!", modifier.padding(all = 24.dp)
    )
}


@Composable
fun GreetingPreview() {
    MyToDoListApppTheme {
        Greeting("Android")
    }
}


@Preview(showSystemUi = true)
@Composable
fun Title() {
    Column()
    {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(color = Color(0xFFf0f1eb)), Alignment.Center
        )
        {
            Text(
                "My List To Do",
                color = Color(0xFF3d6038),
                fontSize = 60.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(3f)
                .background(color = Color(0xFFf0f1eb)),
        )
        {
            Column(modifier = Modifier
                .background(color = Color.Blue)
                .padding(13.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )

            {
                Box(modifier = Modifier.padding(3.dp), contentAlignment = Alignment.Center)
                {
                    Text("Tarea 1", color = Color.White, fontSize = 20.sp)
                }
            }
        }
    }
}