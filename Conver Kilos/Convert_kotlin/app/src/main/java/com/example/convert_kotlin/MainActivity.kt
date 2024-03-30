package com.example.convert_kotlin

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
import com.example.convert_kotlin.ui.theme.Convert_kotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b: Button =findViewById(R.id.b1)
        val t1: TextView =findViewById(R.id.t1)
        val result: TextView =findViewById(R.id.t2)
//    val input =t1.getText()


        b.setOnClickListener(){

            val input:Double = t1.text.toString().toDouble()
            result.setText(""+convert(input))

        }

    }
    private fun convert(input: Double): Double {
        return input / 2.205
    }

}