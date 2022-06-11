package com.capstone.alzheimercare.core.network

import android.util.Log
import com.capstone.alzheimercare.core.network.source.local.LocalDataSource
import com.capstone.alzheimercare.core.network.source.remote.RemoteDataSource
import com.capstone.alzheimercare.core.network.source.remote.ApiResponse
import com.capstone.alzheimercare.core.network.source.remote.response.PatientResponse
import com.capstone.alzheimercare.core.network.source.remote.response.TasksResponse
import com.capstone.alzheimercare.core.network.source.remote.response.CaretakerResponse
import com.capstone.alzheimercare.core.domain.model.Patient
import com.capstone.alzheimercare.core.domain.model.Tasks
import com.capstone.alzheimercare.core.domain.model.Caretaker
import com.capstone.alzheimercare.core.domain.repository.IRepository
import com.capstone.alzheimercare.core.utils.DataMapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class Repository(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
) : IRepository {

    override fun getTasks(idPatient: String): Flow<Resource<List<Tasks>>> =
        object : NetworkBoundResource<List<Tasks>, List<TasksResponse>>() {
            override fun loadFromDB(): Flow<List<Tasks>> {
                return localDataSource.getTasks(idPatient).map {
                    if (it != null) {
                        DataMapper.mapTasksEntitiesToDomain(it)
                    } else {
                        it
                    }
                }
            }

            override fun shouldFetch(data: List<Tasks>?): Boolean = true

            override suspend fun createCall(): Flow<ApiResponse<List<TasksResponse>>> =
                remoteDataSource.getTasks(idPatient)

            override suspend fun saveCallResult(data: List<TasksResponse>) {
                val tasks = data.map {
                    DataMapper.mapTasksResponseToEntity(it)
                }
                CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
                    for (task in tasks) {
                        localDataSource.insertTasks(task)
                    }
                }
            }
        }.asFlow()

    override fun getTasksDetail(id: String): Flow<Resource<Tasks>> =
        object : NetworkBoundResource<Tasks, TasksResponse>() {
            override fun loadFromDB(): Flow<Tasks> {
                return localDataSource.getTasksDetail(id).map {
                    if (it != null) {
                        Log.d("getTasksDetail repo", it.toString())
                        DataMapper.mapTasksEntityToDomain(it)
                    } else {
                        it
                    }
                }
            }

            override fun shouldFetch(data: Tasks?): Boolean = data?.id == ""

            override suspend fun createCall(): Flow<ApiResponse<TasksResponse>> =
                remoteDataSource.getTasksDetail(id)

            override suspend fun saveCallResult(data: TasksResponse) {
                val task = DataMapper.mapTasksResponseToEntity(data)
                CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
                    localDataSource.insertTasks(task)
                }
            }
        }.asFlow()

    override fun insertTasks(task: Tasks) {
        val taskResponse = DataMapper.mapTasksToResponse(task)
        val id = remoteDataSource.insertTasks(taskResponse)
        val taskEntity = DataMapper.mapTasksToEntity(task)
        taskEntity.id = id
        localDataSource.insertTasks(taskEntity)
    }

    override fun updateTasks(task: Tasks) {
        val taskEntity = DataMapper.mapTasksToEntity(task)
        CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
            remoteDataSource.updateTasks(DataMapper.mapTasksToResponse(task))
            localDataSource.updateTasks(taskEntity)
        }
    }

    override fun deleteTasks(id: String) {
        CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
            remoteDataSource.deleteTasks(id)
            localDataSource.deleteTasks(id)
        }
    }

    override fun getPatients(): Flow<List<Patient>> =
        localDataSource.getPatients().map {
            DataMapper.mapPatientEntitiesToDomain(it)
        }

    override fun getPatientDetail(id: String): Flow<Resource<Patient>> =
        object :
            NetworkBoundResource<Patient, PatientResponse>() {
            override fun loadFromDB(): Flow<Patient> {
                return localDataSource.getPatientDetail(id).map {
                    if (it != null) {
                        Log.d("getPatientDetail repo", it.toString())
                        DataMapper.mapPatientEntityToDomain(it)
                    } else Patient()
                }
            }

            override fun shouldFetch(data: Patient?): Boolean {
                return data?.id == ""
            }

            override suspend fun createCall(): Flow<ApiResponse<PatientResponse>> =
                remoteDataSource.getPatientDetail(id)

            override suspend fun saveCallResult(data: PatientResponse) {
                val patientList = DataMapper.mapPatientResponseToEntity(data)
                CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
                    localDataSource.insertPatient(patientList)
                }
            }
        }.asFlow()

    override fun getPatient(email: String): Flow<Resource<Patient>> =
        object :
            NetworkBoundResource<Patient, PatientResponse>() {
            override fun loadFromDB(): Flow<Patient> {
                return localDataSource.getPatient(email).map {
                    if (it != null) {
                        DataMapper.mapPatientEntityToDomain(it)
                    } else {
                        Patient()
                    }
                }
            }

            override fun shouldFetch(data: Patient?): Boolean {
                return data?.id == ""
            }

            override suspend fun createCall(): Flow<ApiResponse<PatientResponse>> =
                remoteDataSource.getPatient(email)

            override suspend fun saveCallResult(data: PatientResponse) {
                if (data.id != "") {
                    val patientList = DataMapper.mapPatientResponseToEntity(data)
                    CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
                        localDataSource.insertPatient(patientList)
                    }
                } else {
                    Log.d("save", data.toString())
                }
            }
        }.asFlow()

    override suspend fun insertPatient(patient: Patient): String {
        val patientResponse = DataMapper.mapPatientToResponse(patient)
        val id = remoteDataSource.insertPatient(patientResponse)
        val patientEntity = DataMapper.mapPatientToEntity(patient)
        patientEntity.id = id
        localDataSource.insertPatient(patientEntity)
        return id
    }


    override fun updatePatient(patient: Patient) {
        val patientEntity = DataMapper.mapPatientToEntity(patient)
        CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
            remoteDataSource.updatePatient(DataMapper.mapPatientToResponse(patient))
            localDataSource.updatePatient(patientEntity)
        }
    }

    override fun updatePicturePatient(id: String, url: String) {
        CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
            remoteDataSource.updatePicturePatient(id, url)
            localDataSource.updatePicturePatient(id, url)
        }
    }

    override fun deletePatient(id: String) {
        CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
            remoteDataSource.deletePatient(id)
            localDataSource.deletePatient(id)
        }
    }

    override fun getCaretaker(): Flow<List<Caretaker>> =
        localDataSource.getCaretaker().map {
            DataMapper.mapCaretakerEntitiesToDomain(it)
        }

    override fun getCaretakerDetail(id: String): Flow<Resource<Caretaker>> =
        object :
            NetworkBoundResource<Caretaker, CaretakerResponse>() {
            override fun loadFromDB(): Flow<Caretaker> {
                return localDataSource.getCaretakerDetail(id).map {
                    if (it != null) {
                        DataMapper.mapCaretakerEntityToDomain(it)
                    } else {
                        Caretaker()
                    }
                }
            }

            override fun shouldFetch(data: Caretaker?): Boolean {
                return data?.id == ""
            }

            override suspend fun createCall(): Flow<ApiResponse<CaretakerResponse>> =
                remoteDataSource.getCaretakerDetail(id)

            override suspend fun saveCallResult(data: CaretakerResponse) {
                val Caretaker = DataMapper.mapCaretakerResponseToEntity(data)
                CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
                    localDataSource.insertCaretaker(Caretaker)
                }
            }
        }.asFlow()

    override fun getCaretaker(email: String): Flow<Resource<Caretaker>> =
        object :
            NetworkBoundResource<Caretaker, CaretakerResponse>() {
            override fun loadFromDB(): Flow<Caretaker> {
                return localDataSource.getCaretaker(email).map {
                    if (it != null) {
                        DataMapper.mapCaretakerEntityToDomain(it)
                    } else {
                        Caretaker()
                    }
                }
            }

            override fun shouldFetch(data: Caretaker?): Boolean {
                return data?.id == ""
            }

            override suspend fun createCall(): Flow<ApiResponse<CaretakerResponse>> =
                remoteDataSource.getCaretaker(email)

            override suspend fun saveCallResult(data: CaretakerResponse) {
                if (data.id != "") {
                    val Caretaker = DataMapper.mapCaretakerResponseToEntity(data)
                    CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
                        localDataSource.insertCaretaker(Caretaker)
                    }
                } else {
                    Log.d("save", data.toString())
                }
            }
        }.asFlow()

    override suspend fun insertCaretaker(Caretaker: Caretaker): String {
        val CaretakerResponse = DataMapper.mapCaretakerToResponse(Caretaker)
        val id = remoteDataSource.insertCaretaker(CaretakerResponse)
        val CaretakerEntity = DataMapper.mapCaretakerToEntity(Caretaker)
        CaretakerEntity.id = id
        localDataSource.insertCaretaker(CaretakerEntity)
        return id
    }

    override fun updateCaretaker(Caretaker: Caretaker) {
        val CaretakerEntity = DataMapper.mapCaretakerToEntity(Caretaker)
        CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
            remoteDataSource.updateCaretaker(DataMapper.mapCaretakerToResponse(Caretaker))
            localDataSource.updateCaretaker(CaretakerEntity)
        }
    }

    override fun updatePictureCaretaker(id: String, url: String) {
        CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
            remoteDataSource.updatePictureCaretaker(id, url)
            localDataSource.updatePictureCaretaker(id, url)
        }
    }

    override fun deleteCaretaker(id: String) {
        CoroutineScope(Dispatchers.Main).launch(Dispatchers.IO) {
            remoteDataSource.deleteCaretaker(id)
            localDataSource.deleteCaretaker(id)
        }
    }

}