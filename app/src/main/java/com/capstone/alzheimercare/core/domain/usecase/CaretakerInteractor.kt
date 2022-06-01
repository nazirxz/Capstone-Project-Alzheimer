package com.capstone.alzheimercare.core.domain.usecase

import com.capstone.alzheimercare.core.network.Resource
import com.capstone.alzheimercare.core.domain.model.Caretaker
import com.capstone.alzheimercare.core.domain.repository.IRepository
import kotlinx.coroutines.flow.Flow

class CaretakerInteractor(private val repository: IRepository) : CaretakerUseCase {
    override fun getCaretaker() = repository.getCaretaker()

    override fun getCaretakerDetail(id: String): Flow<Resource<Caretaker>> = repository.getCaretakerDetail(id)

    override fun getCaretaker(email: String): Flow<Resource<Caretaker>> = repository.getCaretaker(email)

    override suspend fun insertCaretaker(caretaker: Caretaker) = repository.insertCaretaker(caretaker)

    override fun updateCaretaker(caretaker: Caretaker) = repository.updateCaretaker(caretaker)

    override fun updatePictureCaretaker(id: String, url: String) =
        repository.updatePictureCaretaker(id, url)

    override fun deleteCaretaker(id: String) = repository.deleteCaretaker(id)
}