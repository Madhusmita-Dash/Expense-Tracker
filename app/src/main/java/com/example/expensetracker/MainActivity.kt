package com.example.expensetracker

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.expensetracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // View Binding to access UI elements
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up click listeners
        binding.getstartedButton.setOnClickListener {
            // Start SignUp activity when the button is clicked
            startActivity(Intent(this, SignUp::class.java))
        }

        binding.loginTextView.setOnClickListener {
            // Start Login activity when the login text is clicked
            startActivity(Intent(this, Login::class.java))
        }

        // Optional: Customize ImageView or TextViews if needed
        binding.imageView2.setImageResource(R.drawable.spalshscreen) // Ensure the drawable exists
        binding.textView.text = getString(R.string.spend_smarter_nsave_more)
        binding.getstartedButton.text = getString(R.string.get_started)
        binding.loginTextView.text = getString(R.string.already_have_account_log_in)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.top_menu, menu) // Inflate the top menu
        return true
    }
}
