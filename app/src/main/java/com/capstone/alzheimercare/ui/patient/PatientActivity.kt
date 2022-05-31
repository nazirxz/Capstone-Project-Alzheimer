package com.capstone.alzheimercare.ui.patient

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.alzheimercare.databinding.ActivityPatientBinding

class PatientActivity :AppCompatActivity() {
    private lateinit var binding : ActivityPatientBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPatientBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}