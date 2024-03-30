package com.example.kotlintest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlintest.ui.theme.KotlinTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val et:EditText=findViewById(R.id.editText1)

            // getting input from edittext
            val input = et.text

            //button
            val b1:Button = findViewById(R.id.button1)

            // handle the click event on the button
            b1.setOnClickListener(){
                // execute this code when the button is clicked
                Toast.makeText(this@MainActivity,
                    "Fuck you $input",
                    Toast.LENGTH_LONG).show()
            }


    }
}

