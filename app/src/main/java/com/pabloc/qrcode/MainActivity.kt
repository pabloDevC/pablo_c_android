package com.pabloc.qrcode

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pabloc.qrcode.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOrder.setOnClickListener {
            val intent = Intent(this, PasswordActivity::class.java)
            startActivity(intent)
        }

        binding.btnOpen.setOnClickListener {
            val intent = Intent(this, BlunoActivity::class.java)
            startActivity(intent)
        }
    }
}


