package com.example.spotify

import android.content.Intent
import android.widget.ImageView

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpFreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_free)

        val backArrow: ImageView = findViewById(R.id.backArrow)
        backArrow.setOnClickListener {
            finish()
        }

        val btnSignUpLogin: Button = findViewById(R.id.nextButton)
        btnSignUpLogin.setOnClickListener {
            val intent = Intent(this, CreatePasswordActivity::class.java)
            startActivity(intent)
        }
    }
}
