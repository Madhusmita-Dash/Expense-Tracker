package com.example.expensetracker.utils

import com.example.expensetracker.R

// Category data class to hold category information
data class Category(
    val categoryName: String,  // Name of the category
    val categoryImage: Int,    // Resource ID for category image
    val categoryColor: Int     // Resource ID for category color
)

object Constants {

    // Constant values for transaction types
    const val INCOME = "INCOME"
    const val EXPENSE = "EXPENSE"

    // List to hold categories, initialized in the init block
    var categories: ArrayList<Category> = ArrayList()

    // Initialize categories in the init block
    init {
        setCategories()
    }

    // Set categories with images and colors
    private fun setCategories() {
        categories.add(Category("Salary", R.drawable.ic_salary, R.color.category1))   // Ensure these resources exist
        categories.add(Category("Business", R.drawable.ic_business, R.color.category2))
        categories.add(Category("Investment", R.drawable.ic_investment, R.color.category3))
        categories.add(Category("Loan", R.drawable.ic_loan, R.color.category4))
        categories.add(Category("Rent", R.drawable.ic_rent, R.color.category5))
        categories.add(Category("Other", R.drawable.ic_other, R.color.category6))
    }

    // Get details of a category by name
    fun getCategoryDetails(categoryName: String): Category? {
        return categories.find { it.categoryName == categoryName }
    }

    // Get color for account based on account name
    fun getAccountsColor(accountName: String): Int {
        return when (accountName) {
            "Bank" -> R.color.bank_color  // Ensure these resources exist
            "Cash" -> R.color.cash_color
            "Card" -> R.color.card_color
            else -> R.color.default_color
        }
    }
}
