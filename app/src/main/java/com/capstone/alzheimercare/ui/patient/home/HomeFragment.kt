package com.capstone.alzheimercare.ui.patient.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.alzheimercare.databinding.FragmentPatientHomeBinding

class HomeFragment : AppCompatActivity() {
    private lateinit var binding : FragmentPatientHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentPatientHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}