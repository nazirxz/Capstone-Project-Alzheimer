package com.capstone.alzheimercare.core.domain.model

data class Tasks(
    val id: String = "",
    val taskName : String,
    val timeStamp : String,
    val idCaretaker : String,
    val idPatient : String,
)
