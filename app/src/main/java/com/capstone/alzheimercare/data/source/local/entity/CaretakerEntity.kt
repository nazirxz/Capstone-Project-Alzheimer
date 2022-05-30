package com.capstone.alzheimercare.data.source.local.entity
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "caretaker")
data class CaretakerEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    var id: String,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "email")
    val email: String,

    @ColumnInfo(name = "password")
    val password: String,

    @ColumnInfo(name = "phoneNumber")
    val phoneNumber: String,

    @ColumnInfo(name = "dateBirth")
    val dateBirth: String,

    @ColumnInfo(name = "address")
    val address: String,

    @ColumnInfo(name = "gender")
    val gender: String,

    @ColumnInfo(name = "picture")
    var picture: String,
)