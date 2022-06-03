package com.capstone.alzheimercare.ui.caretaker.scanner

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.capstone.alzheimercare.core.domain.usecase.CaretakerUseCase
import com.capstone.alzheimercare.core.domain.model.Tasks
import com.capstone.alzheimercare.core.domain.usecase.TaskUseCase


class ScannerViewModel(
    private val caretakerUseCase: CaretakerUseCase,
    private val taskUseCase: TaskUseCase,
) : ViewModel() {
    fun getCaretaker(id: String) = caretakerUseCase.getCaretakerDetail(id).asLiveData()
    fun insert(task: Tasks) = taskUseCase.insertTasks(task)
}