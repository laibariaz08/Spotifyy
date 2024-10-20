package com.example.spotify

import android.content.Intent  // Import Intent
import android.os.Bundle
import android.widget.Button    // Import Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        // Find the button by ID
        val btnSignUpFree: Button = findViewById(R.id.signupButton)
        btnSignUpFree.setOnClickListener {
            // Navigate to SignUpFreeActivity
            val intent = Intent(this, SignUpFree::class.java)
            startActivity(intent)
        }

        val btnSignUpLogin: Button = findViewById(R.id.signupLogInButton)
        btnSignUpLogin.setOnClickListener {
            // Navigate to SignUpFreeActivity
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
    }
}
