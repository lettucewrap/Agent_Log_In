package com.example.agent_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        var username = findViewById<EditText>(R.id.username)
        var password = findViewById<EditText>(R.id.password)
        var btnReset = findViewById<Button>(R.id.btnReset)
        var btnSubmit = findViewById<Button>(R.id.btnSubmit)

        //reset the username and password text input boxes with empty strings
        btnReset.setOnClickListener {
            username.setText("")
            password.setText("")
        }

        //showing username in Toast but need to verify and validate here
        btnSubmit.setOnClickListener {
            val submitUsername = username.text;
            val submitPassword = password.text;
            Toast.makeText(this@LogInActivity, submitUsername, Toast.LENGTH_LONG).show()

            TODO("VALIDATE/VERIFY USERNAME AND PASSWORD HERE")


        }

    }
}