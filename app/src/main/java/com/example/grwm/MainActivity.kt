package com.example.grwm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_download=findViewById<Button>(R.id.down)
        val btn_upload=findViewById<Button>(R.id.up)

        btn_download.setOnClickListener{
            Toast.makeText(applicationContext,"DownLoading..",Toast.LENGTH_SHORT).show()
        }
        btn_upload.setOnClickListener {
            Toast.makeText(applicationContext,"Uploading..",Toast.LENGTH_SHORT).show()
        }
    }


}