package com.capstone.alzheimercare.ui.patient.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.capstone.alzheimercare.core.domain.usecase.PatientUseCase

class HomeViewModel (
    private val patientUseCase: PatientUseCase,
    ): ViewModel() {
    fun getPatient(id: String) = patientUseCase.getPatientDetail(id).asLiveData()

}