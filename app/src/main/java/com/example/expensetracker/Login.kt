package com.example.expensetracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.expensetracker.R

class Login : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var rememberMeCheckBox: CheckBox
    private lateinit var forgotPasswordTextView: TextView
    private lateinit var loginButton: Button
    private lateinit var registerTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Ensure that the layout XML file is named activity_login.xml

        // Initialize views
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        rememberMeCheckBox = findViewById(R.id.rememberMeCheckBox)
        forgotPasswordTextView = findViewById(R.id.forgotPasswordTextView)
        loginButton = findViewById(R.id.loginButton)
        registerTextView = findViewById(R.id.registerTextView)

        // Set click listeners
        loginButton.setOnClickListener {
            loginUser()
        }

        forgotPasswordTextView.setOnClickListener {
            // Logic for forgot password
            Toast.makeText(this, "Forgot Password clicked", Toast.LENGTH_SHORT).show()
        }

        registerTextView.setOnClickListener {
            // Navigate to Register screen
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }

    private fun loginUser() {
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()
        val rememberMe = rememberMeCheckBox.isChecked

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please enter username and password", Toast.LENGTH_SHORT).show()
        } else {
            // Logic for login (e.g., authenticate with server or database)
            if (username == "admin" && password == "admin") {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()

                // Check if "Remember me" is checked
                if (rememberMe) {
                    // Logic for remembering the user (e.g., saving credentials locally)
                    Toast.makeText(this, "User will be remembered", Toast.LENGTH_SHORT).show()
                }

                // Navigate to another activity after successful login
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Homepage::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
