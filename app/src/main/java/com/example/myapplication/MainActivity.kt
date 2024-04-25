package com.example.myapplication

import android.content.Intent
import android.health.connect.datatypes.units.Length
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton


class MainActivity : AppCompatActivity() {
    companion object{
        const val key = "com.example.myapplication.PlacedOrder"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val placedOrder = findViewById<Button>(R.id.placedOrder)
        val order1 = findViewById<EditText>(R.id.order1)
        val order2 = findViewById<EditText>(R.id.order2)

        placedOrder.setOnClickListener {
            val orders = order1.text.toString() + " " + order2.text.toString()
            intent = Intent(applicationContext,PlacedOrder::class.java)
            intent.putExtra(key,orders)
            Toast.makeText(applicationContext,"your order has been placed",Toast.LENGTH_SHORT).show()
            startActivity(intent)
         }
    }
}