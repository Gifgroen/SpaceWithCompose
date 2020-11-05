package com.gifgroen.spacewithcompose.widget

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun PreviewGreeting() {
    Greeting("Android")
}

@Composable
fun Greeting(name: String) {
    MaterialTheme {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
           Text("Hello $name!")
        }
    }
}