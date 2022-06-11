package com.capstone.alzheimercare.ui.caretaker.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.capstone.alzheimercare.core.domain.usecase.CaretakerUseCase

class ProfileCaretakerViewModel(private val caretakerUseCase: CaretakerUseCase) : ViewModel() {
    fun getCaretaker(id: String) = caretakerUseCase.getCaretakerDetail(id).asLiveData()
}