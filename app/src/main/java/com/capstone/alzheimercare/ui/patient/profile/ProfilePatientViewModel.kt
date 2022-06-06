package com.capstone.alzheimercare.ui.patient.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.capstone.alzheimercare.core.domain.usecase.PatientUseCase

class ProfilePatientViewModel(private val patientUseCase: PatientUseCase) : ViewModel() {
    fun getPatient(id: String) = patientUseCase.getPatientDetail(id).asLiveData()
}