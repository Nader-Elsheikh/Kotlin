package com.example.luckynumber

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val b:Button=findViewById(R.id.b)
        val t:TextView=findViewById(R.id.textView)
        val e:EditText=findViewById(R.id.e1)

        b.setOnClickListener(){
            var name = e.text

            //Explicit Intent
            var i = Intent(this,Sec::class.java)

            //Passing the username
            i.putExtra("name",name)

            startActivity(i)

        }

    }
}