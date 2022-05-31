package com.capstone.alzheimercare.ui.caretaker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.alzheimercare.databinding.ActivityCaretakerBinding
class CaretakerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCaretakerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCaretakerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}