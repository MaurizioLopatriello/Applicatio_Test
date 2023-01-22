package com.android.example.myapplicationtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.example.myapplicationtest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userName = intent.getStringExtra("User")
        val message = "$userName  you will see the ocean "
        binding.SecondTextName.text = message

    }
}