package com.madul.mynet818

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.madul.mynet818.ui.theme.inputActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            home()

        }
    }
}


@Preview(showBackground = true)
@Composable
fun home() {

    Box(Modifier
        .fillMaxSize()){

        Image(painter = painterResource(id = R.drawable.far) , contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop)

        Column(
            Modifier

                .fillMaxSize()
                .fillMaxHeight()
                .fillMaxWidth(),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center


        ) {
            Row {
                Text(text = "Community", color = Color.Red, fontFamily = FontFamily.Cursive, fontSize = 19.sp)
                Spacer(
                    modifier = Modifier
                        .width(30.dp)
                )
                Text(text = "Chats", color = Color.Red, fontFamily = FontFamily.Cursive,fontSize = 19.sp)
                Spacer(
                    modifier = Modifier
                        .width(30.dp)
                )
                Text(text = "Status", color = Color.Red, fontFamily = FontFamily.Cursive,fontSize = 19.sp)
                Spacer(
                    modifier = Modifier
                        .width(30.dp)
                )
                Text("Calls", fontSize = 19.sp, color = Color.Red, fontFamily = FontFamily.Cursive,)
                Spacer(
                    modifier = Modifier
                        .height(30.dp)
                )

            }


            Text(
                "My first App project",
                modifier = Modifier.background(Color.Cyan),
                fontFamily = FontFamily.Monospace
            )
            Spacer(
                modifier = Modifier
                    .height(30.dp)
            )

            Text("Welcome to MYNET APP", fontSize = 20.sp, color = Color.Red                                                                                                                                                                                                                                                                                                                                                                                                                                   )
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )


            val about = LocalContext.current
            Button(
                onClick = {
                    about.startActivity(Intent(about, AboutActivity::class.java))
                },

                ) {
                Text("Community")


            }


            val image = LocalContext.current
            Button(
                onClick = {
                    image.startActivity(Intent(image, imageActivity2::class.java))
                },

                ) {
                Text("images")

            }


            val input = LocalContext.current
            Button(
                onClick = {
                    input.startActivity(Intent(input, inputActivity::class.java))
                },

                ) {
                Text("input")


            }


            val assgn = LocalContext.current
            Button(
                onClick = {
                    assgn.startActivity(Intent(assgn, projectActivity::class.java))
                },

                ) {
                Text("project 1")


            }




        }










    }


}

