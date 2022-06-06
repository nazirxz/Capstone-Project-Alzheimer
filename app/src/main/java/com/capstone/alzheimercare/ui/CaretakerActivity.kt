package com.capstone.alzheimercare.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.capstone.alzheimercare.R
import com.capstone.alzheimercare.databinding.ActivityCaretakerBinding
import com.capstone.alzheimercare.ui.caretaker.guide.GuideFragment
import com.capstone.alzheimercare.ui.caretaker.profile.ProfileFragment
import com.capstone.alzheimercare.ui.caretaker.scanner.ScannerFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class CaretakerActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding: ActivityCaretakerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCaretakerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFragment(ScannerFragment())
        binding.navView.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navigation_scanner -> loadFragment(ScannerFragment())
            R.id.navigation_guide -> loadFragment(GuideFragment())
            R.id.navigation_profile -> loadFragment(ProfileFragment())
        }
        return true
    }

    private fun loadFragment(fragment: Fragment?): Boolean {
        if (fragment != null) {
            supportFragmentManager.apply {
                beginTransaction()
                    .replace(R.id.frame_container, fragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit()
            }
            return true
        }
        return false
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