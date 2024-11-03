package com.example.spotify

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity

class AccountActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_account)


        val backArrow: ImageView = findViewById(R.id.Cancel)
        backArrow.setOnClickListener {
            finish()
        }

        val btnSignUpLogin: Button = findViewById(R.id.signupButton)
        btnSignUpLogin.setOnClickListener {
            val intent = Intent(this, SignUpFree::class.java)
            startActivity(intent)
        }
    }
}