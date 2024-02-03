package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            val username = binding.username.text.toString()
            val password = binding.password.text.toString()

            if (username == "Hamidreza" && password == "1234") {

                Toast.makeText(this, "Login Successful, $username", Toast.LENGTH_SHORT).show()
            } else {
                // Login failed, show error message
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
