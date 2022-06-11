package com.capstone.alzheimercare.core.network.source.local.room

import androidx.room.*
import com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CaretakerDao {

    @Query("SELECT * FROM caretaker ORDER BY name")
    fun getCaretaker(): Flow<List<CaretakerEntity>>

    @Query("SELECT * FROM caretaker WHERE id=:id")
    fun getCaretakerDetail(id: String): Flow<CaretakerEntity>

    @Query("SELECT * FROM caretaker WHERE email=:email")
    fun getCaretaker(email: String): Flow<CaretakerEntity>

    @Query("SELECT * FROM caretaker WHERE email=:email AND password=:password")
    fun getCaretaker(email: String, password: String): Flow<CaretakerEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertCaretaker(caretaker: CaretakerEntity): Long

    @Update
    fun updateCaretaker(caretaker: CaretakerEntity)

    @Query("UPDATE caretaker SET picture=:url WHERE id=:id")
    fun updatePictureCaretaker(id: String, url: String)

    @Query("DELETE FROM caretaker WHERE id=:id")
    fun deleteCaretaker(id: String)
}