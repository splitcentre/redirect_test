package com.example.redirect

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.redirect.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHONE_NUMBER = "extra_phone_number"
        const val EXTRA_EMAIL="extra_email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.redirectto.setOnClickListener {
            val name = binding.username.text.toString()
            val phoneNumber = binding.nomerHp.text.toString()
            val myemail=binding.email.text.toString()

            val intent = Intent(this@MainActivity, Homepage::class.java)
            intent.putExtra(EXTRA_NAME, name)
            intent.putExtra(EXTRA_PHONE_NUMBER, phoneNumber)
            intent.putExtra(EXTRA_EMAIL,myemail)
            startActivity(intent)
        }
    }
}