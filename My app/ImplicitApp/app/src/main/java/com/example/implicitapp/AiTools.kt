package com.example.implicitapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AiTools : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ai_tools)

        val gpt: Button=findViewById(R.id.gpt)
        val copilot: Button=findViewById(R.id.copilot)
        val gimini: Button=findViewById(R.id.gimini)


        gpt.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://chat.openai.com/"))
            startActivity(intent)
        }
        copilot.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://copilot.microsoft.com/"))
            startActivity(intent)
        }
        gimini.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://gemini.google.com/app"))
            startActivity(intent)
        }




    }
}