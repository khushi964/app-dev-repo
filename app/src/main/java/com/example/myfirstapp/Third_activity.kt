package com.example.myfirstapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val btnBack2 = findViewById<Button>(R.id.btnBack)
        btnBack2.setOnClickListener {
            finish()
        }
    }
}
