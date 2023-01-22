package com.android.example.myapplicationtest

import android.content.Intent
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import com.android.example.myapplicationtest.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var insertName =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            insertName = binding.edit.text.toString()
            if (insertName == "") {
                Snackbar.make(
                    binding.root,
                    "Please insert your name !", Snackbar.LENGTH_LONG
                )
                    .show()
                binding.button2.visibility = INVISIBLE

            } else {
                val message = "Welcome  $insertName"
                binding.name.text = message
                binding.edit.text.clear()
                binding.button2.visibility = VISIBLE
            }
        }
        binding.button2.setOnClickListener {
            val intent = Intent(this ,
                SecondActivity::class.java)
            intent.putExtra("User",insertName)
            startActivity(intent)
        }
    }
}
