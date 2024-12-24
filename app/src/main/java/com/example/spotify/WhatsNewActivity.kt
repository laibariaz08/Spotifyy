package com.example.spotify

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class WhatsNewActivity: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.whats_new)

        val backArrow: ImageView = findViewById(R.id.backArrow)
        backArrow.setOnClickListener {
            finish()
        }
    }

}