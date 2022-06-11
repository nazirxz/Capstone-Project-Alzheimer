package com.capstone.alzheimercare.core.network.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.capstone.alzheimercare.core.network.source.local.entity.PatientEntity
import com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity
import com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity

@Database(
    entities = [CaretakerEntity::class, PatientEntity::class,TaskEntity::class,],
    version = 1,
    exportSchema = false
)
abstract class Database : RoomDatabase() {
    abstract fun patientDao(): PatientDao
    abstract fun caretakerDao(): CaretakerDao
    abstract fun taskDao() : TaskDao
}