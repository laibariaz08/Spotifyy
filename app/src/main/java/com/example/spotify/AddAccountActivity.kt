package com.example.spotify
import android.content.Intent
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AddAccountActivity: AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_account)

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