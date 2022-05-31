package com.capstone.alzheimercare.utils

import com.capstone.alzheimercare.network.source.local.entity.PatientEntity
import com.capstone.alzheimercare.network.source.local.entity.CaretakerEntity
import com.capstone.alzheimercare.network.source.remote.response.PatientResponse
import com.capstone.alzheimercare.network.source.remote.response.CaretakerResponse
import com.capstone.alzheimercare.domain.model.Patient
import com.capstone.alzheimercare.domain.model.Caretaker

object DataMapper {

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