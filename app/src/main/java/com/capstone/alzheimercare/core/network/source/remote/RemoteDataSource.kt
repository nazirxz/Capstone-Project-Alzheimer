package com.capstone.alzheimercare.core.network.source.remote

import android.util.Log
import com.capstone.alzheimercare.core.network.source.remote.response.PatientResponse
import com.capstone.alzheimercare.core.network.source.remote.response.CaretakerResponse
import com.capstone.alzheimercare.core.network.source.remote.response.TasksResponse
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await
import java.text.SimpleDateFormat
import java.util.*

class RemoteDataSource {
    private val db = FirebaseFirestore.getInstance()



    private val patientDb = db.collection("patient")
    private val caretakerDb = db.collection("caretaker")
    private val taskDb = db.collection("tasks")

    fun getTasks(idPatient:String) : Flow<ApiResponse<List<TasksResponse>>> {
        return flow {
            val data = taskDb.get().await()
            val tasks = data.toObjects(TasksResponse::class.java)
            if (tasks.isNotEmpty()) {
                val list = tasks.filter {
                    it.idPatient == idPatient
                }

                Log.d("getTasks", list.toString())
                emit(ApiResponse.Success(list))
            } else {
                emit(ApiResponse.Success(arrayListOf<TasksResponse>()))
            }
        }
    }

    fun getTasksDetail(id: String): Flow<ApiResponse<TasksResponse>> {
        return flow {
            val data = taskDb.document(id).get().await()
            val note = data.toObject(TasksResponse::class.java) as TasksResponse
            Log.d("getTasksDetail", note.toString())
            emit(ApiResponse.Success(note))
        }.flowOn(Dispatchers.IO)
    }

    fun insertTasks(task: TasksResponse): String {
        return try {
            val id = taskDb.document().id
            task.id = id
            taskDb.document(id).set(task)
                .addOnSuccessListener {
                    Log.d("insertTasks", "Saved to DB")
                }
                .addOnFailureListener {
                    Log.e("insertTasks", "Error saving to DB")
                }
            id
        } catch (e: Exception) {
            Log.e("insertTasks m", e.message.toString())
            ""
        }
    }

    fun updateTasks(task: TasksResponse) {
        try {
            taskDb.document(task.id).set(task)
                .addOnSuccessListener {
                    Log.d("updateTasks", "Update DB")
                }
                .addOnFailureListener {
                    Log.e("updateTasks", "Error update in DB")
                }
        } catch (e: Exception) {
            Log.e("updateTasks", e.message.toString())
        }
    }

    fun deleteTasks(id: String) {
        try {
            taskDb.document(id).delete()
                .addOnSuccessListener {
                    Log.d("deleteTasks", "Delete DB")
                }
                .addOnFailureListener {
                    Log.e("deleteTasks", "Error delete in DB")
                }
        } catch (e: Exception) {
            Log.e("deleteTasks", e.message.toString())
        }
    }



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
            val caretaker = data.toObject(CaretakerResponse::class.java) as CaretakerResponse
            Log.d("getCaretakerDetail", caretaker.toString())
            emit(ApiResponse.Success(caretaker))
        }.flowOn(Dispatchers.IO)
    }

    fun getCaretaker(email: String): Flow<ApiResponse<CaretakerResponse>> {
        return flow {
            val data = caretakerDb.get().await()
            val caretakers = data.toObjects(CaretakerResponse::class.java)
            if (caretakers.isNotEmpty()) {
                var isAvailable = true
                for (caretaker in caretakers) {
                    if (caretaker.email == email) {
                        isAvailable = false
                        Log.d("getCaretaker",caretaker.toString())
                        emit(ApiResponse.Success(caretaker))
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

    suspend fun insertCaretaker(caretaker: CaretakerResponse): String {
        return try {
            val id = caretakerDb.document().id
            caretaker.id = id
            caretakerDb.document().set(caretaker)
                .addOnSuccessListener {
                    Log.d("insertCaretaker", "Saved to DB")
                }
                .addOnFailureListener {
                    Log.e("insertCaretaker", "Error saving to DB")
                }
                .await()
            id
        } catch (e: Exception) {
            Log.e("insertCaretaker", e.message.toString())
            ""
        }
    }

    fun updateCaretaker(caretaker: CaretakerResponse) {
        try {
            caretakerDb.document(caretaker.id).set(caretaker)
                .addOnSuccessListener {
                    Log.d("updateCaretaker", "Update DB")
                }
                .addOnFailureListener {
                    Log.e("updateCaretaker", "Error update in DB")
                }
        } catch (e: Exception) {
            Log.e("updateCaretaker", e.message.toString())
        }
    }

    fun updatePictureCaretaker(id: String, uri: String) {
        try {
            caretakerDb.document(id).update(mapOf("picture" to uri))
                .addOnSuccessListener {
                    Log.d("updatePictureCaretaker", "Success to Change Picture")
                }
                .addOnFailureListener {
                    Log.d("updatePictureCaretaker", "Error saving to DB")
                }
        } catch (e: Exception) {
            Log.e("updatePictureCaretaker", e.message.toString())
        }
    }

    fun deleteCaretaker(id: String) {
        try {
            caretakerDb.document(id).delete()
                .addOnSuccessListener {
                    Log.d("deleteCaretaker", "Delete DB")
                }
                .addOnFailureListener {
                    Log.e("deleteCaretaker", "Error delete in DB")
                }
        } catch (e: Exception) {
            Log.e("deleteCaretaker", e.message.toString())
        }
    }
}