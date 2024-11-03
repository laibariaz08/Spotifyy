package com.example.spotify

import android.os.Bundle
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity

class LogIn : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val backArrow: ImageView = findViewById(R.id.backArrow)
        backArrow.setOnClickListener {
            // Close the current activity and go back
            finish()
        }
    }
}