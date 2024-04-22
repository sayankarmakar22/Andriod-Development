package com.example.myapplication

import android.health.connect.datatypes.units.Length
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
//        val dark = findViewById<Button>(R.id.dark)
//        val light = findViewById<Button>(R.id.light)
//        val layout = findViewById<LinearLayout>(R.id.linearLayout)
//
//        dark.setOnClickListener {
//            layout.setBackgroundResource(R.color.black)
//        }
//        light.setOnClickListener {
//            layout.setBackgroundResource(R.color.yellow)
//        }
//        val toggle = findViewById<Switch>(R.id.toggleSwitch)
//        val layout = findViewById<RelativeLayout>(R.id.mainLayout)
//
//
//        toggle.setOnCheckedChangeListener { buttonView, isChecked ->
//            if (isChecked) {
//                layout.setBackgroundResource(R.color.yellow)
//                Toast.makeText(applicationContext,"changing to yellow mode....",Toast.LENGTH_SHORT).show()
//            } else {
//                layout.setBackgroundResource(R.color.white)
//                Toast.makeText(applicationContext,"changing to normal mode..",Toast.LENGTH_SHORT).show();
//            }
//        }
    }
}