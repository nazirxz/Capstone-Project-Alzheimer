package com.capstone.alzheimercare.data.source.local

import com.capstone.alzheimercare.data.source.local.entity.PatientEntity
import com.capstone.alzheimercare.data.source.local.entity.CaretakerEntity
import com.capstone.alzheimercare.data.source.local.room.PatientDao
import com.capstone.alzheimercare.data.source.local.room.CaretakerDao

class LocalDataSource(
    private val patientDao: PatientDao,
    private val caretakerDao: CaretakerDao,
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

    fun insertCaretaker(staff: CaretakerEntity) = caretakerDao.insertCaretaker(staff)

    fun updateCaretaker(staff: CaretakerEntity) = caretakerDao.updateCaretaker(staff)

    fun updatePictureCaretaker(id: String, url: String) = caretakerDao.updatePictureCaretaker(id, url)

    fun deleteCaretaker(id: String) = caretakerDao.deleteCaretaker(id)
}