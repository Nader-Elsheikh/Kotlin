package com.example.implicitapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val sites:Button = findViewById(R.id.sites)
        val torrent:Button = findViewById(R.id.torrent)
        val movies:Button = findViewById(R.id.movies)
        val graphics:Button = findViewById(R.id.graphics)
        val aiTools:Button = findViewById(R.id.ai)



        sites.setOnClickListener(){
            val intent = Intent(this, Sites::class.java)
            startActivity(intent)
        }
        torrent.setOnClickListener(){
            val intent = Intent(this, Torrent::class.java)
            startActivity(intent)
        }
        movies.setOnClickListener(){
            val intent = Intent(this, Movies::class.java)
            startActivity(intent)
        }
        graphics.setOnClickListener(){
            val intent = Intent(this, Graphics::class.java)
            startActivity(intent)
        }
        aiTools.setOnClickListener(){
            val intent = Intent(this, AiTools::class.java)
            startActivity(intent)
        }




    }
    override fun onCreateOptionsMenu (menu:Menu):Boolean{
        menuInflater.inflate(R.menu.my_menu,menu)
        return true
    }
}
