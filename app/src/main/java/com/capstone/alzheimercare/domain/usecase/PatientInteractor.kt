package com.capstone.alzheimercare.domain.usecase

import com.capstone.alzheimercare.data.Resource
import com.capstone.alzheimercare.domain.model.Patient
import com.capstone.alzheimercare.domain.repository.IRepository
import com.capstone.alzheimercare.domain.usecase.PatientUseCase
import kotlinx.coroutines.flow.Flow

class PatientInteractor(private val repository: IRepository) : PatientUseCase {
    override fun getPatients() = repository.getPatients()

    override fun getPatientDetail(id: String): Flow<Resource<Patient>> =
        repository.getPatientDetail(id)

    override fun getPatient(email: String): Flow<Resource<Patient>> = repository.getPatient(email)

    override suspend fun insertPatient(patient: Patient) = repository.insertPatient(patient)

    override fun updatePatient(patient: Patient) = repository.updatePatient(patient)

    override fun updatePicturePatient(id: String, url: String) =
        repository.updatePicturePatient(id, url)

    override fun deletePatient(id: String) = repository.deletePatient(id)
}