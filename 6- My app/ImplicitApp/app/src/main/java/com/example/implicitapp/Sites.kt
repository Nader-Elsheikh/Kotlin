package com.example.implicitapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Sites : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sites)

        val get:Button=findViewById(R.id.get)
        val pirate:Button=findViewById(R.id.pirate)
        val sigma:Button=findViewById(R.id.sigma)

        get.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://getintopc.com/"))
            startActivity(intent)
        }
        pirate.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.thepiratecity.co/"))
            startActivity(intent)
        }
        sigma.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://sigma-4pc.com/"))
            startActivity(intent)
        }


    }
}