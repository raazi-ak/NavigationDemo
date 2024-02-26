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
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun FirstScreen(navigationToSecondScreen:(String,Int)->Unit){
    val name  = remember { mutableStateOf("") }
    val age = remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text("This is the first screen")
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(value = name.value, onValueChange = {
            name.value=it
        }, modifier = Modifier.padding(bottom=8.dp), label = {Text("Name")})
        OutlinedTextField(value = age.value, onValueChange = {
            age.value=it
        }, modifier = Modifier.padding(bottom=8.dp), label ={ Text(text = "Age")})
        Button(onClick = { navigationToSecondScreen(name.value,age.value.toInt())}) {
            Text("Go to next screen 2nd")
        }
    }
}

