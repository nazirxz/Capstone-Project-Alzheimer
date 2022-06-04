package com.capstone.alzheimercare.ui.login

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.lifecycleScope
import com.capstone.alzheimercare.R
import com.capstone.alzheimercare.databinding.ActivityLoginBinding
import com.capstone.alzheimercare.ui.MyPreference
import com.capstone.alzheimercare.ui.CaretakerActivity
import com.capstone.alzheimercare.ui.PatientActivity
import com.capstone.alzheimercare.ui.caretaker.task.AddTaskFragment
import com.capstone.alzheimercare.ui.signup.SignUpActivity
import com.capstone.alzheimercare.utils.Utility.setColor
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.koin.android.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var preference: MyPreference
    private val viewModel: LoginViewModel by viewModel()
    private var check = false
    private var emailError = false
    private var passwordError = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        preference = MyPreference(this)

        initListeners()
        initObserver()

        binding.btnSignin.setOnClickListener {
            check = false
            val email = binding.etEmail.text.toString()
            viewModel.checkPatient(email).observe(this, { it1 ->
                if (it1.data != null) {
                    val patient = it1.data
                    if (patient.id != "") {
                        if (patient.password == binding.etPassword.text.toString()) {
                            check = true
                            preference.setId(patient.id)
                            preference.setRole("Patient")
                            startActivity(Intent(this, PatientActivity::class.java))
                            finish()
                        } else {
                            check = true
                            binding.etPassword.error = "Wrong Password"
                        }
                    } else {
                        viewModel.checkCaretaker(email).observe(this, { it2 ->
                            if (it2.data != null) {
                                check = true
                                val caretaker = it2.data
                                if (caretaker .id != "") {
                                    if (caretaker .password == binding.etPassword.text.toString()) {
                                        check = true
                                        preference.setId(caretaker .id)
                                        preference.setRole("Caretaker")
                                        startActivity(Intent(this, CaretakerActivity::class.java))
                                        finish()
                                    } else {
                                        check = true
                                        binding.etPassword.error = "Wrong Password"
                                    }
                                } else if (!check) {
                                    MaterialAlertDialogBuilder(this)
                                        .setMessage(getString(R.string.email_not_found))
                                        .setPositiveButton(getString(R.string.ok), null)
                                        .show()
                                }
                            }
                        })
                    }
                }
            })
        }

        binding.tvClick.apply {
            paintFlags =
                paintFlags or Paint.UNDERLINE_TEXT_FLAG

            setOnClickListener {
                val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
                startActivity(intent)
                this@LoginActivity.finish()
            }
        }
    }

    private fun initListeners() {
        binding.etEmail.addTextChangedListener {
            viewModel.setEmail(it.toString())
            if (it.toString() != "") {
                emailError = false
                if (!Patterns.EMAIL_ADDRESS.matcher(it.toString()).matches()) {
                    emailError = true
                    binding.etEmail.error = "Incorrect format for Email"
                }
            } else {
                emailError = true
                binding.etEmail.error = "Email Can't Be Blank"
            }

            if (emailError) {
                binding.txtEmail.setColor(R.color.red)
            } else {
                binding.txtEmail.setColor(R.color.blue)
            }
        }

        binding.etPassword.addTextChangedListener {
            viewModel.setPassword(it.toString())
            if (it.toString() != "") {
                passwordError = false
                if (it.toString().length < 5) {
                    passwordError = true
                    binding.etPassword.error =
                        "Password Length should be greater than 5 characters"
                }
            } else {
                passwordError = true
                binding.etPassword.error = "Password Can't Be Blank"
            }

            if (passwordError) {
                binding.txtPassword.setColor(R.color.red)
            } else {
                binding.txtPassword.setColor(R.color.blue)
            }
        }
    }

    private fun initObserver() {
        lifecycleScope.launch {
            viewModel.isSubmitEnabled.collect { value ->
                binding.btnSignin.isEnabled = value
            }
        }
    }

    override fun onBackPressed() {
        MaterialAlertDialogBuilder(this)
            .setMessage(getString(R.string.exit_text))
            .setNegativeButton(getString(R.string.no), null)
            .setPositiveButton(getString(R.string.yes)) { _, _ ->
                super.onBackPressed()
            }
            .show()
    }
}