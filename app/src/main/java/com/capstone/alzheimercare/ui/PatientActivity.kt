package com.capstone.alzheimercare.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.alzheimercare.R
import com.capstone.alzheimercare.databinding.ActivityPatientBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class PatientActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPatientBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPatientBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 0) {
            MaterialAlertDialogBuilder(this)
                .setMessage(getString(R.string.exit_text))
                .setNegativeButton(getString(R.string.no), null)
                .setPositiveButton(getString(R.string.yes)) { _, _ ->
                    super.onBackPressed()
                }
                .show()
        } else {
            supportFragmentManager.popBackStack()
        }
    }
}