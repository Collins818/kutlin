package com.madul.mynet818

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.madul.mynet818.ui.theme.MYNET818Theme

class imageActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            image()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun image() {
    Column {
Image(painter = painterResource(id = R.drawable.far) , contentDescription = "",
    modifier = Modifier
        .size(150.dp)


)








        val about = LocalContext.current
        Button(
            onClick = {
                about.startActivity(Intent(about, AboutActivity::class.java))
            },

            ) {
            Text("about")




        }

        AsyncImage(
            model = "https://plus.unsplash.com/premium_photo-1668824632073-5b76f7946a72?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxfHx8ZW58MHx8fHx8",
            contentDescription = null,
        )


    }
}



