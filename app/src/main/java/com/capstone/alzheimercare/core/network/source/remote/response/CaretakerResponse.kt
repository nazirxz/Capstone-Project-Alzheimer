package com.capstone.alzheimercare.core.network.source.remote.response

data class CaretakerResponse(
    var id: String = "",
    val name: String = "",
    val email: String = "",
    val password: String = "",
    val phoneNumber: String = "",
    val dateBirth: String = "",
    val address: String = "",
    val gender: String = "",
    val picture: String = "",
)