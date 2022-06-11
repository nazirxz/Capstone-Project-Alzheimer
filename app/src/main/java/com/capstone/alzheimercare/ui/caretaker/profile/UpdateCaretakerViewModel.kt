package com.capstone.alzheimercare.ui.caretaker.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.capstone.alzheimercare.core.domain.model.Caretaker
import com.capstone.alzheimercare.core.domain.usecase.CaretakerUseCase

class UpdateCaretakerViewModel(private val caretakerUseCase: CaretakerUseCase) : ViewModel() {
    fun getCaretaker(id: String) = caretakerUseCase.getCaretakerDetail(id).asLiveData()
    fun update(caretaker: Caretaker) = caretakerUseCase.updateCaretaker(caretaker)
    fun updatePicture(id: String, url: String) = caretakerUseCase.updatePictureCaretaker(id, url)
}