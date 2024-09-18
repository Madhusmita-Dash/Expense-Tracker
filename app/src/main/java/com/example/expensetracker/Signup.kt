package com.example.expensetracker

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Accessing views from the XML layout
        val usernameEditText = findViewById<EditText>(R.id.edittext)
        val emailEditText = findViewById<EditText>(R.id.fontfamily)
        val passwordEditText = findViewById<EditText>(R.id.pass)
        val resetPasswordEditText = findViewById<EditText>(R.id.reset)
        val signupButton = findViewById<Button>(R.id.signup)
        val footerTextView = findViewById<TextView>(R.id.ftr)

        // Signup button click event
        signupButton.setOnClickListener {
            val username = usernameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()
            val resetPassword = resetPasswordEditText.text.toString().trim()

            // Input validation
            if (validateInput(username, email, password, resetPassword)) {
                // You can handle the sign-up logic here (e.g., save to database or start new activity)
                Toast.makeText(this, "Sign-up successful!", Toast.LENGTH_SHORT).show()
            }
        }

        // Footer text click event to handle login navigation
        footerTextView.setOnClickListener {
            // Navigate to login activity or handle login process
            Toast.makeText(this, "Navigating to login screen...", Toast.LENGTH_SHORT).show()
        }
    }

    // Function to validate user inputs
    private fun validateInput(username: String, email: String, password: String, resetPassword: String): Boolean {
        when {
            TextUtils.isEmpty(username) -> {
                Toast.makeText(this, "Please enter a username", Toast.LENGTH_SHORT).show()
                return false
            }
            TextUtils.isEmpty(email) -> {
                Toast.makeText(this, "Please enter an email", Toast.LENGTH_SHORT).show()
                return false
            }
            TextUtils.isEmpty(password) -> {
                Toast.makeText(this, "Please enter a password", Toast.LENGTH_SHORT).show()
                return false
            }
            password != resetPassword -> {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
                return false
            }
            else -> return true
        }
    }
}
