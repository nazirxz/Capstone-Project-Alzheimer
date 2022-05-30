package com.capstone.alzheimercare.domain.usecase

import com.capstone.alzheimercare.data.Resource
import com.capstone.alzheimercare.domain.model.Caretaker
import kotlinx.coroutines.flow.Flow

interface CaretakerUseCase {
    fun getCaretaker(): Flow<List<Caretaker>>
    fun getCaretakerDetail(id: String): Flow<Resource<Caretaker>>
    fun getCaretaker(email: String): Flow<Resource<Caretaker>>
    suspend fun insertCaretaker(staff: Caretaker): String
    fun updateCaretaker(staff: Caretaker)
    fun updatePictureCaretaker(id: String, url: String)
    fun deleteCaretaker(id: String)
}