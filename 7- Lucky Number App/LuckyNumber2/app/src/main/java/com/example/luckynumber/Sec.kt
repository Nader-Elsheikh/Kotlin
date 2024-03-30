package com.example.luckynumber

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class Sec : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sec)

        val t1:TextView=findViewById(R.id.t2)
        val t2:TextView=findViewById(R.id.t3)
        val share:Button=findViewById(R.id.b1)

        var username = Receive()
        Toast.makeText(this,""+username,Toast.LENGTH_LONG).show()

        var ran_num =generate()
        t2.setText(""+ran_num)

        share.setOnClickListener(){
            share(username,ran_num)
        }
        

    }

    fun Receive():String {
        var bundle: Bundle? =intent.extras
        var username = bundle?.get("name").toString()
        return username
    }

    // Random number
    fun generate():Int{
        val random= Random.nextInt(1000)
        return random
    }

    // share username & lucky number
    fun share (name:String , num:Int){
        var intent =Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_SUBJECT,"$name is lucky today")
        intent.putExtra(Intent.EXTRA_TEXT,"$num is his lucky number")
        startActivity(intent)
    }

}

