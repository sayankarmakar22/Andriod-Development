package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dark = findViewById<Button>(R.id.dark)
        val light = findViewById<Button>(R.id.light)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        dark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
        light.setOnClickListener {
            layout.setBackgroundResource(R.color.yellow)
        }
    }
}