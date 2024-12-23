package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnBack1= findViewById<Button>(R.id.btnBack)

        btnNext.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        btnBack1.setOnClickListener {
            finish() // Closes the current activity and returns to the previous one
        }
    }
}

