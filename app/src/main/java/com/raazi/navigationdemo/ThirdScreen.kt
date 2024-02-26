package com.raazi.navigationdemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ThirdScreen(NavigateToFirstScreen:()->Unit){


    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text("This is the third screen")
        Spacer(modifier = Modifier.padding(8.dp))

        Button(onClick = { NavigateToFirstScreen() }) {
            Text("Go to next screen 1st")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview2(){
    ThirdScreen({})
}