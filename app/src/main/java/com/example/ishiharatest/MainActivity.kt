package com.example.ishiharatest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ishiharatest.R
import com.example.ishiharatest.ui.theme.IshiharaTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IshiharaTestTheme() {
                IshiharaTestApp()
            }
        }
    }
}

@Preview
@Composable
fun IshiharaTestApp() {
    IshiharaWithButtonAndImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun IshiharaWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(0) }
    val imageResource = when (result) {
        1 -> R.drawable.img
        2 -> R.drawable.img_2
        3 -> R.drawable.img_3
        4 -> R.drawable.img_4
        5 -> R.drawable.img_5
        6 -> R.drawable.img_6
        7 -> R.drawable.img_7
        8 -> R.drawable.img_8
        else -> R.drawable.img_10

    }
    val imageResource1 = when (result) {
        1 -> R.drawable.img74
        2 -> R.drawable.img16
        3 -> R.drawable.img2
        4 -> R.drawable.img29
        5 -> R.drawable.img7
        6 -> R.drawable.img45
        7 -> R.drawable.img5
        8 -> R.drawable.img97
        9 -> R.drawable.img42
        else -> R.drawable.imgdef
    }


    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(imageResource), contentDescription = result.toString())
        Image(painter = painterResource(imageResource1), contentDescription = result.toString())
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { result = (1..10).random() }) {
            Text(text = "NEXT", fontSize = 24.sp)
        }
    }

}