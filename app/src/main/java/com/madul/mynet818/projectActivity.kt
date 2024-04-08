package com.madul.mynet818

import android.content.Intent
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.madul.mynet818.ui.theme.MYNET818Theme

class projectActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            project()


        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun project() {

    Box(Modifier
        .fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.dak) , contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop)


        LazyColumn(
            Modifier
                .padding(30.dp)
                .fillMaxSize()
        ) {

            item {
                Column {
                    Row(
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.men),
                            contentDescription = "",
                            modifier = Modifier
                                .background(color = Color.White)
                                .size(20.dp)
                        )
//                    Text("Airplane", color = Color.Black)


                        Spacer(
                            modifier = Modifier
                                .padding(30.dp)
                        )




                        Column {
                            Text(text = "Current location", color = Color.Red, fontSize = 10.sp)
                            Spacer(
                                modifier = Modifier
                                    .height(10.dp)
                            )
                            Row {
                                Icon(
                                    imageVector = Icons.Default.LocationOn, contentDescription = "",
                                    Modifier
                                        .size(10.dp)
                                        .background(Color.Gray),
                                    Color.Blue
                                )
                                Text("Densasoa,Bali", fontSize = 10.sp, color = Color.Red)

                            }
                            Spacer(
                                modifier = Modifier
                                    .width(200.dp)
                            )

                        }
                        Image(
                            painter = painterResource(id = R.drawable.far),
                            contentDescription = "",
                            modifier = Modifier
                                .size(20.dp),
//    colorFilter = ColorFilter.tint(color = Color.Red)


                        )


                    }
                    Column() {
                        Row(horizontalArrangement = Arrangement.Center) {

                            val home = LocalContext.current

                            Button(
                                onClick = {
                                    home.startActivity(Intent(home, MainActivity::class.java))


                                },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                border = BorderStroke(0.dp, Color.Gray),


                                )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.hot),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .background(color = Color.Gray)
                                        .size(20.dp)


                                )


                                Text("Hotels", color = Color.Blue)

                            }
                            Spacer(
                                modifier = Modifier
                                    .width(30.dp)
                            )


                            val Holiday = LocalContext.current

                            Button(
                                onClick = {
                                    Holiday.startActivity(Intent(Holiday, MainActivity::class.java))


                                },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                border = BorderStroke(0.dp, Color.Gray),


                                )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.bich),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .background(color = Color.Gray)
                                        .size(20.dp)


                                )





                                Text("Holiday", color = Color.Blue)


                            }

                        }

                        Row {

                            val Taxi = LocalContext.current

                            Button(
                                onClick = {
                                    Taxi.startActivity(Intent(Taxi, MainActivity::class.java))


                                },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                border = BorderStroke(0.dp, Color.Gray),


                                )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.tax),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .background(color = Color.Gray)
                                        .size(20.dp)


                                )

                                Text("Taxi", color = Color.Blue)


                            }
                            Spacer(
                                modifier = Modifier
                                    .width(40.dp)
                            )


                            val Ticket = LocalContext.current

                            Button(
                                onClick = {
                                    Ticket.startActivity(Intent(Ticket, MainActivity::class.java))


                                },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                border = BorderStroke(0.dp, Color.Gray),


                                )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.tic),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .background(color = Color.Gray)
                                        .size(20.dp)



                                )

                                Text("Ticket", color = Color.Blue)


                            }


                        }


                        Row {

                            val Airplane = LocalContext.current

                            Button(
                                onClick = {
                                    Airplane.startActivity(Intent(Airplane, MainActivity::class.java))


                                },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                border = BorderStroke(0.dp, Color.Gray),


                                )
                            {

                                Image(
                                    painter = painterResource(id = R.drawable.air),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .background(color = Color.Gray)
                                        .size(20.dp)
                                )
                                Text("Airplane", color = Color.Blue)


                            }
                            Spacer(
                                modifier = Modifier
                                    .width(20.dp)
                            )


                            val Habour = LocalContext.current

                            Button(
                                onClick = {
                                    Habour.startActivity(Intent(Habour, MainActivity::class.java))


                                },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                border = BorderStroke(0.dp, Color.Gray),


                                )
                            {

                                Image(
                                    painter = painterResource(id = R.drawable.ship),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .background(color = Color.Gray)
                                        .size(20.dp)
                                )
                                Text("Habour", color = Color.Blue)


                            }


                        }
//


                    }

                    Column {
                        Row {
                            Text(text = "Popular in town", color = Color.White)
                            Spacer(
                                modifier = Modifier
                                    .width(100.dp)
                            )
                            Text(text = "View all", color = Color.Red, fontSize = 15.sp)
                            Spacer(modifier = Modifier
                                .height(40.dp))


                        }



                        Row {
                            Image(painter = painterResource(id = R.drawable.umi) , contentDescription = "",
                                modifier = Modifier
                                    .size(100.dp)




                            )



                            Spacer(modifier = Modifier
                                .width(50.dp))


                            Image(painter = painterResource(id = R.drawable.io) , contentDescription = "",
                                modifier = Modifier
                                    .size(100.dp)
                            )







                        }
                        Row {
                            val ki = LocalContext.current
                            val ji = AnnotatedString("",)
                            ClickableText(text = ji, onClick = {
                                ki.startActivity(Intent(ki, MainActivity::class.java))

                            },
                                modifier = Modifier
                            )

                        Text("Hawaii", color = Color.Red,)










                            Spacer(modifier = Modifier
                                .width(110.dp))

                            val kk = LocalContext.current
                            val jj = AnnotatedString("",)
                            ClickableText(text = jj, onClick = {
                                kk.startActivity(Intent(kk, MainActivity::class.java))

                            })

                            Text("MOMBASA", color = Color.Red, )





                        }











                        Spacer(modifier = Modifier
                            .height(30.dp))
                        Row {

                            Image(painter = painterResource(id = R.drawable.far) , contentDescription = "",
                                modifier = Modifier
                                    .size(150.dp)


                            )



                            Spacer(modifier = Modifier
                                .width(50.dp))


                            AsyncImage(
                                model = "https://plus.unsplash.com/premium_photo-1668824632073-5b76f7946a72?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxfHx8ZW58MHx8fHx8",
                                contentDescription = null,
                                modifier =Modifier
                                    .size(100.dp)
                            )







                        }

                        val about = LocalContext.current
                        Button(
                            onClick = {
                                about.startActivity(Intent(about, AboutActivity::class.java))
                            },

                            ) {
                            Text("about")




                        }



                    }

                    Column {
                        var search by remember {
                            mutableStateOf(TextFieldValue(""))

                        }
                        OutlinedTextField(value = search, onValueChange = {search=it},
                            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },



                            label ={ Text( "search your place", color = Color.Blue)},
                            colors = TextFieldDefaults.outlinedTextFieldColors(unfocusedBorderColor = Color.White,
                                focusedBorderColor = Color.Red,),









                            )



                    }







                }
            }
        }





    }

















}

