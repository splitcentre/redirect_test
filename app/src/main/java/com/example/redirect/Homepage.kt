package com.example.redirect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.redirect.databinding.ActivityHomepageBinding

class Homepage : AppCompatActivity() {
    private lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(MainActivity.EXTRA_NAME)
        val phoneNumber = intent.getStringExtra(MainActivity.EXTRA_PHONE_NUMBER)

        binding.nama.text = "$name"
        binding.phone.text = "$phoneNumber"

    }
}