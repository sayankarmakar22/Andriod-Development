package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val upload = findViewById<Button>(R.id.btnUpload)
        val download = findViewById<Button>(R.id.btnDownload)

        upload.setOnClickListener{
            Toast.makeText(applicationContext,"uploading...",Toast.LENGTH_SHORT).show()
        }
        download.setOnClickListener{
            Toast.makeText(applicationContext,"downloading...",Toast.LENGTH_SHORT).show()
        }
    }
}