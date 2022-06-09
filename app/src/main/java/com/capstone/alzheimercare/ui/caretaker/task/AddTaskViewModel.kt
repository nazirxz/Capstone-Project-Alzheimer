package com.capstone.alzheimercare.ui.caretaker.task

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.capstone.alzheimercare.core.domain.usecase.CaretakerUseCase
import com.capstone.alzheimercare.core.domain.model.Tasks
import com.capstone.alzheimercare.core.domain.usecase.TaskUseCase


class AddTaskViewModel(
    private val caretakerUseCase: CaretakerUseCase,
    private val taskUseCase: TaskUseCase,
) : ViewModel() {
    fun getCaretaker(id: String) = caretakerUseCase.getCaretakerDetail(id).asLiveData()
    fun getTask(id:String) = taskUseCase.getTasks(id).asLiveData()
    fun insert(task: Tasks) = taskUseCase.insertTasks(task)
}