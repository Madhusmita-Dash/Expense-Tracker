package com.example.expensetracker.utils

import java.text.SimpleDateFormat
import java.util.Date

object Helper {

    fun formatDate(date: Date): String {
        val dateFormat = SimpleDateFormat("dd MMM, yyyy")
        return dateFormat.format(date)
    }
}
