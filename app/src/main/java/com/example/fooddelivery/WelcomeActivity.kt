package com.example.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)
        val button = findViewById<Button>(R.id.next_button)
        button.setOnClickListener { startActivity(Intent(this, SignInActivity::class.java)) }


    }
}