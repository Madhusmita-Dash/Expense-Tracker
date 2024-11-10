package com.example.expensetracker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Categories : AppCompatActivity() {

    // Declare views
    private lateinit var expenseTitle: TextView
    private lateinit var buttonFood: Button
    private lateinit var buttonRent: Button
    private lateinit var buttonCloth: Button
    private lateinit var buttonBike: Button
    private lateinit var buttonParty: Button
    private lateinit var buttonShopping: Button
    private lateinit var buttonBill: Button
    private lateinit var buttonProject: Button
    private lateinit var buttonClub: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories) // Ensure layout is correct

        // Initialize views
        expenseTitle = findViewById(R.id.expenseTitle)

        // Initialize category buttons
        buttonFood = findViewById(R.id.button2)
        buttonRent = findViewById(R.id.button3)
        buttonCloth = findViewById(R.id.button4)
        buttonBike = findViewById(R.id.button5)
        buttonParty = findViewById(R.id.button6)
        buttonShopping = findViewById(R.id.button7)
        buttonBill = findViewById(R.id.button8)
        buttonProject = findViewById(R.id.button9)
        buttonClub = findViewById(R.id.button10)

        // Set click listeners for category buttons
        setCategoryClickListener(buttonFood, "Food")
        setCategoryClickListener(buttonRent, "Rent")
        setCategoryClickListener(buttonCloth, "Cloth")
        setCategoryClickListener(buttonBike, "Bike")
        setCategoryClickListener(buttonParty, "Party")
        setCategoryClickListener(buttonShopping, "Shopping")
        setCategoryClickListener(buttonBill, "Bill")
        setCategoryClickListener(buttonProject, "Project")
        setCategoryClickListener(buttonClub, "Club")
    }

    // Function to set a click listener on a button and update the TextView
    private fun setCategoryClickListener(button: Button, categoryName: String) {
        button.setOnClickListener {
            expenseTitle.text = categoryName
            Toast.makeText(this, "$categoryName selected", Toast.LENGTH_SHORT).show()
        }
    }
}
