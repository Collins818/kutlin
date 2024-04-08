package com.madul.mynet818

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Community()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Community() {
    Column (
        Modifier
            .background(Color.Gray)
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,

    ) {


        val home = LocalContext.current

        Button(
            onClick = {
                home.startActivity(Intent(home, MainActivity::class.java))


            },
            colors = ButtonDefaults.buttonColors(Color.White),
            border = BorderStroke(5.dp, Color.Red)


        )
        {
            Text("home", color = Color.Red)

        }

        val kk = LocalContext.current
        val jj = AnnotatedString("click",)
        ClickableText(text = jj, onClick = {
            kk.startActivity(Intent(kk, MainActivity::class.java))

        })

        Text("Contact this communities", color = Color.White, fontFamily = FontFamily.Cursive,)

        Row {

            val bb = LocalContext.current
            val cc = AnnotatedString("Red cross")
            ClickableText(text = cc, onClick = {
                bb.startActivity(Intent(bb, MainActivity::class.java))

            })

            val nn = LocalContext.current
            val oo = AnnotatedString("St john",)
            ClickableText(text = oo, onClick = {
                nn.startActivity(Intent(nn, MainActivity::class.java))


            })
            val dd = LocalContext.current
            val ff = AnnotatedString("Mynetwrld",)
            ClickableText(text = ff, onClick = {
                dd.startActivity(Intent(dd, MainActivity::class.java))


            })

        }
    }
}



