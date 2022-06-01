package com.capstone.alzheimercare.core.network.source.local

import com.capstone.alzheimercare.core.network.source.local.entity.PatientEntity
import com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity
import com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity
import com.capstone.alzheimercare.core.network.source.local.room.PatientDao
import com.capstone.alzheimercare.core.network.source.local.room.CaretakerDao
import com.capstone.alzheimercare.core.network.source.local.room.TaskDao

class LocalDataSource(
    private val patientDao: PatientDao,
    private val caretakerDao: CaretakerDao,
    private val taskDao : TaskDao,
) {

    fun getPatients() = patientDao.getPatients()
    fun getPatientDetail(id: String) = patientDao.getPatientDetail(id)
    fun getPatient(email: String) = patientDao.getPatient(email)
    fun getPatient(email: String, password: String) = patientDao.getPatient(email, password)
    fun insertPatient(patient: PatientEntity) = patientDao.insertPatient(patient)
    fun updatePatient(patient: PatientEntity) = patientDao.updatePatient(patient)
    fun updatePicturePatient(id: String, url: String) = patientDao.updatePicturePatient(id, url)
    fun deletePatient(id: String) = patientDao.deletePatient(id)


    fun getCaretaker() = caretakerDao.getCaretaker()
    fun getCaretakerDetail(id: String) = caretakerDao.getCaretakerDetail(id)
    fun getCaretaker(email: String) = caretakerDao.getCaretaker(email)
    fun getCaretaker(email: String, password: String) = caretakerDao.getCaretaker(email, password)
    fun insertCaretaker(caretaker: CaretakerEntity) = caretakerDao.insertCaretaker(caretaker)
    fun updateCaretaker(caretaker: CaretakerEntity) = caretakerDao.updateCaretaker(caretaker)
    fun updatePictureCaretaker(id: String, url: String) = caretakerDao.updatePictureCaretaker(id, url)
    fun deleteCaretaker(id: String) = caretakerDao.deleteCaretaker(id)

    fun getTasks(idPatient: String) = taskDao.getTasks(idPatient)
    fun getTasksDetail(id:String) = taskDao.getTask(id)
    fun insertTasks(task: TaskEntity) = taskDao.insertTasks(task)
    fun updateTasks(task: TaskEntity) = taskDao.updateTasks(task)
    fun deleteTasks(id : String) = taskDao.deleteTasks(id)
}