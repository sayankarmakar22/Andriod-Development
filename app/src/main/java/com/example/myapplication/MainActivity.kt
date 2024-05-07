package com.example.uiux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.firebase.firestore.FirebaseFirestore
import java.sql.SQLData

class MainActivity : AppCompatActivity() {

//    lateinit var database: FirebaseFires

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<TextInputEditText>(R.id.userEmail)
        val name = findViewById<TextInputEditText>(R.id.userName)
        val register = findViewById<Button>(R.id.register)


        register.setOnClickListener {
            val  enteredEmail = email.text.toString()
            val  enteredName = name.text.toString()

            val db = FirebaseDatabase.getInstance().getReference("Users")
            val regisUser = RegisteredUsers(enteredName,enteredEmail)

            //create
            db.child(enteredName).setValue(regisUser).addOnSuccessListener {
                Toast.makeText(this,"Registration Done!",Toast.LENGTH_SHORT).show()
            }
                //read
//            db.child(enteredName).get().addOnSuccessListener {
//                if(it.exists()){
//                    val name = it.child("name").value
//                    val email = it.child("email").value
//
//                    Toast.makeText(this,"name : "+ name + " " + "email : "+ email ,Toast.LENGTH_LONG) .show()
//                }
//            }

            //update
//            val updatedUser = mapOf<String,String>(
//                "name" to enteredName,
//                "email" to enteredEmail
//            )
//            db.child(enteredName).updateChildren(updatedUser).addOnSuccessListener {
//                Toast.makeText(this,"Updated " ,Toast.LENGTH_LONG) .show()
//            }

            //delete

//            db.child(enteredName).removeValue().addOnSuccessListener {
//                Toast.makeText(this,"Deleted " ,Toast.LENGTH_LONG) .show()
//            }
        }

    }
}