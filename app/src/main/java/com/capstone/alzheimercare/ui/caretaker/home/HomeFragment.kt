package com.capstone.alzheimercare.ui.caretaker.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.alzheimercare.databinding.FragmentCaretakerHomeBinding

class HomeFragment : AppCompatActivity() {
    private lateinit var binding : FragmentCaretakerHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentCaretakerHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}