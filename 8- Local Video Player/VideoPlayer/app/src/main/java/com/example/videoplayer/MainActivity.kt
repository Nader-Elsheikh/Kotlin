package com.example.videoplayer

import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Displaying video from local storage
        val v :VideoView=findViewById(R.id.v1)
        v.setVideoPath(
            "android.resource://"
                    + packageName+"/"
                    +R.raw.nb
        )


        val controller = MediaController(this)
        controller.setAnchorView(v)
        controller.setMediaPlayer(v)
        v.setMediaController(controller)




    }
}