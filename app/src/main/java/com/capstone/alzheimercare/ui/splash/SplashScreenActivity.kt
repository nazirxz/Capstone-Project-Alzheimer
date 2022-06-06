package com.capstone.alzheimercare.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.capstone.alzheimercare.R
import com.capstone.alzheimercare.ui.CaretakerActivity
import com.capstone.alzheimercare.ui.MyPreference
import com.capstone.alzheimercare.ui.PatientActivity
import com.capstone.alzheimercare.ui.onboarding.OnboardingActivity

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var preference: MyPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        preference = MyPreference(this)

        window.setFlags(
            FULL_SCREEN_FLAG,
            FULL_SCREEN_FLAG
        )
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            if (preference.getId() == "") {
                startActivity(Intent(this, OnboardingActivity::class.java))
            } else {
                when (preference.getRole()) {
                    "Patient" -> startActivity(Intent(this, PatientActivity::class.java))
                    "Caretaker" -> startActivity(Intent(this, CaretakerActivity::class.java))
                }
            }
            finish()
        }, TIME)
    }

    companion object {
        private const val TIME = 3000L
        private const val FULL_SCREEN_FLAG = 1024
    }
}