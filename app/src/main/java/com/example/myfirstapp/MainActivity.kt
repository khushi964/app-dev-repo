package com.example.myfirstapp
import android.widget.Toast
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val btn = findViewById<Button>(R.id.login_button)
        btn.setOnClickListener {
            Toast.makeText(this,"login btn is clicked khushi",Toast.LENGTH_SHORT).show()
        }


    }
}