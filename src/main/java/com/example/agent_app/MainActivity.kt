package com.example.agent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn : Button = findViewById(R.id.button)
        loginBtn.setOnClickListener {
            val intent = Intent(this, LogInActivity ::class.java)
            startActivity(intent)
        }
    }
}