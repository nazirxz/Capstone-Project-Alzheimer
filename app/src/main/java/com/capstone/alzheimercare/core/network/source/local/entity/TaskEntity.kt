package com.capstone.alzheimercare.core.network.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    var id: String,

    @ColumnInfo(name = "taskName")
    var taskName: String,

    @ColumnInfo(name = "timeStamp")
    var timeStamp: String,

    @ColumnInfo(name = "idCaretaker")
    var idCaretaker: String,

    @ColumnInfo(name = "idPatient")
    var idPatient: String,
)