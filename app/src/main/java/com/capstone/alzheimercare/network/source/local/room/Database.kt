package com.capstone.alzheimercare.network.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.capstone.alzheimercare.network.source.local.entity.PatientEntity
import com.capstone.alzheimercare.network.source.local.entity.CaretakerEntity

@Database(
    entities = [CaretakerEntity::class, PatientEntity::class, ],
    version = 1,
    exportSchema = false
)
abstract class Database : RoomDatabase() {
    abstract fun patientDao(): PatientDao
    abstract fun caretakerDao(): CaretakerDao
}