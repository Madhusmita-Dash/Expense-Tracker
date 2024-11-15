package com.example.expensetracker

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.expensetracker.databinding.FragmentAddTransactionBinding
import com.example.expensetracker.util.Constants
import java.util.*

class AddTransactionFragment : Fragment() {

    private var _binding: FragmentAddTransactionBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddTransactionBinding.inflate(inflater, container, false)

        setupListeners()

        return binding.root
    }

    private fun setupListeners() {
        // Income Button Click
        binding.incomeBtn.setOnClickListener {
            binding.incomeBtn.setBackgroundResource(R.drawable.income_selector)
            binding.expenseBtn.setBackgroundResource(R.drawable.default_selector)
            binding.expenseBtn.setTextColor(requireContext().getColor(R.color.textColor))
            binding.incomeBtn.setTextColor(requireContext().getColor(R.color.greenColor))


        }

        // Expense Button Click
        binding.expenseBtn.setOnClickListener {
            binding.incomeBtn.setBackgroundResource(R.drawable.default_selector)
            binding.expenseBtn.setBackgroundResource(R.drawable.expense_selector)
            binding.incomeBtn.setTextColor(requireContext().getColor(R.color.textColor))
            binding.expenseBtn.setTextColor(requireContext().getColor(R.color.redColor))


        }
        binding.saveTransactionBtn.setOnClickListener {
            // Perform any transaction saving logic here

            // Navigate back to Homepage (replace fragment or go back)
            val activity = requireActivity() as AppCompatActivity
            val fragmentTransaction = activity.supportFragmentManager.beginTransaction()


            // Option 2: Go back to the previous fragment in the stack
            activity.supportFragmentManager.popBackStack()
        }
    }




    }

