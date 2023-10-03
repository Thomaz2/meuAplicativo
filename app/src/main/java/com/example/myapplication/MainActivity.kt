package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                TextoCartao()
            }
        }
    }
}

@Preview(showSystemUi  = true)
@Composable
fun TextoCartao (){

    Image(
        painter = painterResource(id = R.drawable.vinte_anos),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 0.5f,
        modifier = Modifier.fillMaxSize()

    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {


        Text(
            text = "Feliz aniversário. hghhhhhhhhh",
            fontSize = 50.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Black,
            fontFamily = FontFamily.Cursive,
            color = Color.Red,
            lineHeight = 80.sp,
            modifier = Modifier
                .padding(bottom = 560.dp)

        )
        Dedicatoria(nomes = "de: Thomaz")

        Dedicatoria(nomes = "Para: mari")

    }

}

@Composable
fun Dedicatoria(nomes:String){

    Text(
        text = nomes,
        fontSize = 30.sp,
        textAlign = TextAlign.End,
        fontWeight = FontWeight.Black,
        fontFamily = FontFamily.Cursive,
        color = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 50.dp)


    )
}
