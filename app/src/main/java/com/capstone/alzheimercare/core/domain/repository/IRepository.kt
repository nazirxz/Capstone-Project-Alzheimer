package com.capstone.alzheimercare.core.domain.repository

import com.capstone.alzheimercare.core.domain.model.Caretaker
import com.capstone.alzheimercare.core.network.Resource
import com.capstone.alzheimercare.core.domain.model.Patient
import com.capstone.alzheimercare.core.domain.model.Tasks
import kotlinx.coroutines.flow.Flow

interface IRepository {


    fun getPatients(): Flow<List<Patient>>
    fun getPatientDetail(id: String): Flow<Resource<Patient>>
    fun getPatient(email: String): Flow<Resource<Patient>>
    suspend fun insertPatient(patient: Patient): String
    fun updatePatient(patient: Patient)
    fun updatePicturePatient(id: String, url: String)
    fun deletePatient(id: String)

    fun getTasks(idPatient: String): Flow<Resource<List<Tasks>>>
    fun getTasksDetail(id: String): Flow<Resource<Tasks>>
    fun insertTasks(task: Tasks)
    fun updateTasks(task: Tasks)
    fun deleteTasks(id: String)

    fun getCaretaker(): Flow<List<Caretaker>>
    fun getCaretakerDetail(id: String): Flow<Resource<Caretaker>>
    fun getCaretaker(email: String): Flow<Resource<Caretaker>>
    suspend fun insertCaretaker(caretaker: Caretaker): String
    fun updateCaretaker(caretaker: Caretaker)
    fun updatePictureCaretaker(id: String, url: String)
    fun deleteCaretaker(id: String)
}