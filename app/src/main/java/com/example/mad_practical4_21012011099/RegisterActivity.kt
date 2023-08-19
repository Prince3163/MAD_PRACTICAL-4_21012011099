package com.example.mad_practical4_21012011099

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val login: TextView =findViewById(R.id.login)
        login.setOnClickListener() {
            val i= Intent(this,LoginActivity ::class.java).also { startActivity(it) }
        }
    }
}