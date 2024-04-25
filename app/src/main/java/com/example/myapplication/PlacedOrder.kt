package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PlacedOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placed_order)

        val showOrder = findViewById<TextView>(R.id.showOrder)


        val custOrder = intent.getStringExtra(MainActivity.key)
        showOrder.text = custOrder


    }
}