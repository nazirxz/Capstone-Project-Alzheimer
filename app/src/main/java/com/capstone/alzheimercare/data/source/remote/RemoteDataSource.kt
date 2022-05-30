package com.capstone.alzheimercare.data.source.remote

import android.util.Log
import com.capstone.alzheimercare.data.source.remote.network.ApiResponse
import com.capstone.alzheimercare.data.source.remote.response.PatientResponse
import com.capstone.alzheimercare.data.source.remote.response.CaretakerResponse
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await

class RemoteDataSource {
    private val db = FirebaseFirestore.getInstance()

    private val patientDb = db.collection("patient")
    private val caretakerDb = db.collection("caretaker")

    fun getPatient(email: String): Flow<ApiResponse<PatientResponse>> {
        return flow {
            val data = patientDb.get().await()
            val patients = data.toObjects(PatientResponse::class.java)
            if (patients.isNotEmpty()) {
                var isAvailable = true
                for (patient in patients) {
                    if (patient.email == email) {
                        isAvailable = false
                        emit(ApiResponse.Success(patient))
                        break
                    }
                }
                if (isAvailable) {
                    emit(ApiResponse.Success(PatientResponse()))
                }
            } else {
                emit(ApiResponse.Success(PatientResponse()))
            }
        }.flowOn(Dispatchers.IO)
    }

    fun getPatientDetail(id: String): Flow<ApiResponse<PatientResponse>> {
        return flow {
            val data = patientDb.document(id).get().await()
            val patient = data.toObject(PatientResponse::class.java) as PatientResponse
            emit(ApiResponse.Success(patient))
        }.flowOn(Dispatchers.IO)
    }

    suspend fun insertPatient(patient: PatientResponse): String {
        return try {
            val id = patientDb.document().id
            patient.id = id
            patientDb.document(id).set(patient)
                .addOnSuccessListener {
                    Log.d("insertPatient", "Saved to DB")
                }
                .addOnFailureListener {
                    Log.e("insertPatient", "Error saving to DB")
                }
                .await()
            id
        } catch (e: Exception) {
            Log.e("insertPatient", e.message.toString())
            ""
        }
    }

    fun updatePatient(patient: PatientResponse) {
        try {
            patientDb.document(patient.id).set(patient)
                .addOnSuccessListener {
                    Log.d("updatePatient", "Update DB")
                }
                .addOnFailureListener {
                    Log.e("updatePatient", "Error update in DB")
                }
        } catch (e: Exception) {
            Log.e("updatePatient", e.message.toString())
        }
    }

    fun updatePicturePatient(id: String, uri: String) {
        try {
            patientDb.document(id).update(mapOf("picture" to uri))
                .addOnSuccessListener {
                    Log.d("updatePicturePatient", "Success to Change Picture")
                }
                .addOnFailureListener {
                    Log.d("updatePicturePatient", "Error saving to DB")
                }
        } catch (e: Exception) {
            Log.e("updatePicturePatient", e.message.toString())
        }
    }

    fun deletePatient(id: String) {
        try {
            patientDb.document(id).delete()
                .addOnSuccessListener {
                    Log.d("deletePatient", "Delete DB")
                }
                .addOnFailureListener {
                    Log.e("deletePatient", "Error delete in DB")
                }
        } catch (e: Exception) {
            Log.e("deletePatient", e.message.toString())
        }
    }


    fun getCaretakerDetail(id: String): Flow<ApiResponse<CaretakerResponse>> {
        return flow {
            val data = caretakerDb.document(id).get().await()
            val staff = data.toObject(CaretakerResponse::class.java) as CaretakerResponse
            Log.d("getStaffDetail", staff.toString())
            emit(ApiResponse.Success(staff))
        }.flowOn(Dispatchers.IO)
    }

    fun getCaretaker(email: String): Flow<ApiResponse<CaretakerResponse>> {
        return flow {
            val data = caretakerDb.get().await()
            val staffs = data.toObjects(CaretakerResponse::class.java)
            if (staffs.isNotEmpty()) {
                var isAvailable = true
                for (staff in staffs) {
                    if (staff.email == email) {
                        isAvailable = false
                        Log.d("getStaff", staff.toString())
                        emit(ApiResponse.Success(staff))
                        break
                    }
                }
                if (isAvailable) {
                    emit(ApiResponse.Success(CaretakerResponse()))
                }
            } else {
                emit(ApiResponse.Success(CaretakerResponse()))
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun insertCaretaker(staff: CaretakerResponse): String {
        return try {
            val id = caretakerDb.document().id
            staff.id = id
            caretakerDb.document().set(staff)
                .addOnSuccessListener {
                    Log.d("insertStaff", "Saved to DB")
                }
                .addOnFailureListener {
                    Log.e("insertStaff", "Error saving to DB")
                }
                .await()
            id
        } catch (e: Exception) {
            Log.e("insertStaff", e.message.toString())
            ""
        }
    }

    fun updateCaretaker(staff: CaretakerResponse) {
        try {
            caretakerDb.document(staff.id).set(staff)
                .addOnSuccessListener {
                    Log.d("updateStaff", "Update DB")
                }
                .addOnFailureListener {
                    Log.e("updateStaff", "Error update in DB")
                }
        } catch (e: Exception) {
            Log.e("updateStaff", e.message.toString())
        }
    }

    fun updatePictureCaretaker(id: String, uri: String) {
        try {
            caretakerDb.document(id).update(mapOf("picture" to uri))
                .addOnSuccessListener {
                    Log.d("updatePictureStaff", "Success to Change Picture")
                }
                .addOnFailureListener {
                    Log.d("updatePictureStaff", "Error saving to DB")
                }
        } catch (e: Exception) {
            Log.e("updatePictureStaff", e.message.toString())
        }
    }

    fun deleteCaretaker(id: String) {
        try {
            caretakerDb.document(id).delete()
                .addOnSuccessListener {
                    Log.d("deleteStaff", "Delete DB")
                }
                .addOnFailureListener {
                    Log.e("deleteStaff", "Error delete in DB")
                }
        } catch (e: Exception) {
            Log.e("deleteStaff", e.message.toString())
        }
    }
}