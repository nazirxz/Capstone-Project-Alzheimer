package com.capstone.alzheimercare.core.utils

import com.capstone.alzheimercare.core.network.source.local.entity.PatientEntity
import com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity
import com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity
import com.capstone.alzheimercare.core.network.source.remote.response.PatientResponse
import com.capstone.alzheimercare.core.network.source.remote.response.CaretakerResponse
import com.capstone.alzheimercare.core.domain.model.Tasks
import com.capstone.alzheimercare.core.domain.model.Patient
import com.capstone.alzheimercare.core.domain.model.Caretaker
import com.capstone.alzheimercare.core.network.source.remote.response.TasksResponse

object DataMapper {

    fun mapTasksToEntity(input: Tasks) = TaskEntity(
        id = input.id,
        taskName = input.taskName,
        timeStamp = input.timeStamp,
        idCaretaker = input.idCaretaker,
        idPatient = input.idPatient
    )

    fun mapTasksToResponse(input: Tasks) = TasksResponse(
        id = input.id,
        taskName = input.taskName,
        timeStamp = input.timeStamp,
        idCaretaker = input.idCaretaker,
        idPatient = input.idPatient
    )

    fun mapTasksEntitiesToDomain(input: List<TaskEntity>): List<Tasks> =
        input.map {
            mapTasksEntityToDomain(it)
        }

    fun mapTasksEntityToDomain(input: TaskEntity) = Tasks(
        id = input.id,
        taskName = input.taskName,
        timeStamp = input.timeStamp,
        idCaretaker = input.idCaretaker,
        idPatient = input.idPatient
    )

    fun mapTasksResponseToEntity(input: TasksResponse) = TaskEntity(
        id = input.id,
        taskName = input.taskName,
        timeStamp = input.timeStamp,
        idCaretaker = input.idCaretaker,
        idPatient = input.idPatient
    )

    fun mapPatientToEntity(input: Patient) = PatientEntity(
        id = input.id,
        name = input.name,
        email = input.email,
        password = input.password,
        phoneNumber = input.phoneNumber,
        dateBirth = input.dateBirth,
        address = input.address,
        gender = input.gender,
        bloodType = input.bloodType,
        picture = input.picture,
        term = input.term
    )

    fun mapPatientToResponse(input: Patient) = PatientResponse(
        id = input.id,
        name = input.name,
        email = input.email,
        password = input.password,
        phoneNumber = input.phoneNumber,
        dateBirth = input.dateBirth,
        address = input.address,
        gender = input.gender,
        bloodType = input.bloodType,
        picture = input.picture,
        term = input.term
    )

    fun mapPatientEntitiesToDomain(input: List<PatientEntity>): List<Patient> =
        input.map {
            mapPatientEntityToDomain(it)
        }

    fun mapPatientEntityToDomain(input: PatientEntity) = Patient(
        id = input.id,
        name = input.name,
        email = input.email,
        password = input.password,
        phoneNumber = input.phoneNumber,
        dateBirth = input.dateBirth,
        address = input.address,
        gender = input.gender,
        bloodType = input.bloodType,
        picture = input.picture,
        term = input.term
    )

    fun mapPatientResponseToEntity(input: PatientResponse) = PatientEntity(
        id = input.id,
        name = input.name,
        email = input.email,
        password = input.password,
        phoneNumber = input.phoneNumber,
        dateBirth = input.dateBirth,
        address = input.address,
        gender = input.gender,
        bloodType = input.bloodType,
        picture = input.picture,
        term = input.term
    )


    fun mapCaretakerToEntity(input: Caretaker) = CaretakerEntity(
        id = input.id,
        name = input.name,
        email = input.email,
        password = input.password,
        phoneNumber = input.phoneNumber,
        dateBirth = input.dateBirth,
        address = input.address,
        gender = input.gender,
        picture = input.picture
    )

    fun mapCaretakerToResponse(input: Caretaker) = CaretakerResponse(
        id = input.id,
        name = input.name,
        email = input.email,
        password = input.password,
        phoneNumber = input.phoneNumber,
        dateBirth = input.dateBirth,
        address = input.address,
        gender = input.gender,
        picture = input.picture
    )

    fun mapCaretakerEntitiesToDomain(input: List<CaretakerEntity>): List<Caretaker> =
        input.map {
            mapCaretakerEntityToDomain(it)
        }

    fun mapCaretakerEntityToDomain(input: CaretakerEntity) = Caretaker(
        id = input.id,
        name = input.name,
        email = input.email,
        password = input.password,
        phoneNumber = input.phoneNumber,
        dateBirth = input.dateBirth,
        address = input.address,
        gender = input.gender,
        picture = input.picture
    )

    fun mapCaretakerResponseToEntity(input: CaretakerResponse) = CaretakerEntity(
        id = input.id,
        name = input.name,
        email = input.email,
        password = input.password,
        phoneNumber = input.phoneNumber,
        dateBirth = input.dateBirth,
        address = input.address,
        gender = input.gender,
        picture = input.picture
    )
}