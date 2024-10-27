package com.example.spotify

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class search_library_activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_library)

        val backArrow: ImageView = findViewById(R.id.backButton)
        backArrow.setOnClickListener {
            // Close the current activity and go back
            finish()
        }
    }
}