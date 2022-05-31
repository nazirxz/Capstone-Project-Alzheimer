package com.capstone.alzheimercare.ui.signup

import android.util.Patterns
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.capstone.alzheimercare.domain.model.Patient
import com.capstone.alzheimercare.domain.model.Caretaker
import com.capstone.alzheimercare.domain.usecase.PatientUseCase
import com.capstone.alzheimercare.domain.usecase.CaretakerUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine

class SignUpViewModel(
    private val patientUseCase: PatientUseCase,
    private val caretakerUseCase: CaretakerUseCase,
) : ViewModel() {
    private val _email = MutableStateFlow("")
    private val _password = MutableStateFlow("")
    private val _repeat = MutableStateFlow("")

    fun setEmail(email: String) {
        _email.value = email
    }

    fun setPassword(password: String) {
        _password.value = password
    }

    fun setRepeat(repeat: String) {
        _repeat.value = repeat
    }

    val isSubmitEnabled: Flow<Boolean> =
        combine( _email, _password, _repeat) { email, password, repeat ->
            val isEmailCorrect = Patterns.EMAIL_ADDRESS.matcher(email).matches()
            val isPasswordCorrect = password.length >= 5
            val isPasswordSame = password == repeat
            return@combine isEmailCorrect and isPasswordCorrect and isPasswordSame
        }

    suspend fun insertPatient(patient: Patient) = patientUseCase.insertPatient(patient)

    suspend fun insertCaretaker(caretaker: Caretaker) = caretakerUseCase.insertCaretaker(caretaker)

    fun checkPatient(email: String) = patientUseCase.getPatient(email).asLiveData()

    fun checkCaretaker(email: String) = caretakerUseCase.getCaretaker(email).asLiveData()

}