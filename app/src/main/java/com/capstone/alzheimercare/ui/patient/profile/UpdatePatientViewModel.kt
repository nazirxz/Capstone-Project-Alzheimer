package com.capstone.alzheimercare.ui.patient.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.capstone.alzheimercare.core.domain.model.Patient
import com.capstone.alzheimercare.core.domain.usecase.PatientUseCase

class UpdatePatientViewModel(private val patientUseCase: PatientUseCase) : ViewModel() {
    fun getPatient(id: String) = patientUseCase.getPatientDetail(id).asLiveData()
    fun update(patient: Patient) = patientUseCase.updatePatient(patient)
    fun updatePicture(id: String, url: String) = patientUseCase.updatePicturePatient(id, url)
}