package com.example.redirect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redirectbutton = findViewById<MaterialButton>(R.id.redirectto)
        redirectbutton.setOnClickListener{
            val intel=Intent(this, Homepage::class.java)
            startActivity(intel)
        }
    }
}