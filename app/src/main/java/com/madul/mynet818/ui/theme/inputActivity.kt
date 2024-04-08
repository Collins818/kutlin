package com.madul.mynet818.ui.theme

import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.madul.mynet818.R
import com.madul.mynet818.ui.theme.ui.theme.MYNET818Theme

class inputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            input()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun input() {

    Box(
        Modifier
            .fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.gi) , contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            Modifier
                .fillMaxSize(),



            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            

            Text("MYNET WRLD", color = Color.Red, fontSize = 60.sp, fontStyle = FontStyle.Italic,
                )

            var name by remember {
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(value = name, onValueChange ={name =it},
                label ={ Text( "name")},
                textStyle = TextStyle(Color.White),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                leadingIcon = { Icon(imageVector = Icons.Default.Home, contentDescription = "")},
                colors = TextFieldDefaults.outlinedTextFieldColors(unfocusedBorderColor = Color.White,
                    focusedBorderColor = Color.Red,
                    unfocusedTextColor = Color.White,
                    focusedTextColor = Color.White,
                    cursorColor = Color.Black,
                    unfocusedLabelColor = Color.Red,
                    focusedLabelColor = Color.White,
                    focusedLeadingIconColor = Color.Red,
                    unfocusedLeadingIconColor = Color.White

                )
                )
            Spacer(modifier = Modifier
                .height(20.dp))



            var email by remember {
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(value = email, onValueChange ={email =it},
                label ={ Text( "email")},
                textStyle = TextStyle(Color.White),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
                colors = TextFieldDefaults.outlinedTextFieldColors(unfocusedBorderColor = Color.White,
                    focusedBorderColor = Color.Red,
                    unfocusedTextColor = Color.White,
                    focusedTextColor = Color.Yellow,
                    cursorColor = Color.Black,
                    unfocusedLabelColor = Color.Red,
                    focusedLeadingIconColor = Color.Red,
                    unfocusedLeadingIconColor = Color.White

                )
            )
            Spacer(modifier = Modifier
                .height(20.dp))


            var password by remember {
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(value = password, onValueChange ={password =it},
                label ={ Text( "password")},
                textStyle = TextStyle(Color.White),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
                colors = TextFieldDefaults.outlinedTextFieldColors(unfocusedBorderColor = Color.White,
                    focusedBorderColor = Color.Red,
                    unfocusedTextColor = Color.White,
                    focusedTextColor = Color.Yellow,
                    cursorColor = Color.Black,
                    unfocusedLabelColor = Color.Red,
                    focusedLeadingIconColor = Color.Red,
                    unfocusedLeadingIconColor = Color.White

                )
                )






















        }









    }





}


