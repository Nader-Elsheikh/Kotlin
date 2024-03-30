package com.example.counter_kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.counter_kotlin.ui.theme.Counter_KotlinTheme

class MainActivity : ComponentActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var T:TextView=findViewById(R.id.T1)
        val B:Button=findViewById(R.id.B1)
        val R:Button=findViewById(R.id.R)



        B.setOnClickListener(){
            T.setText(""+addC())
        }
        R.setOnClickListener(){
            T.setText("0")
        }



    }

    fun addC ():Int{
        counter++
        return counter
    }
}