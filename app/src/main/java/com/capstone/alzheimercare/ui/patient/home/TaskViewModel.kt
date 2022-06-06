package com.capstone.alzheimercare.ui.patient.home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.capstone.alzheimercare.core.domain.usecase.TaskUseCase

class TaskViewModel(private val taskUseCase: TaskUseCase) : ViewModel() {

    fun getTasks(idPatient: String) = taskUseCase.getTasks(idPatient).asLiveData()

    fun getTasksDetail(id: String) = taskUseCase.getTasksDetail(id).asLiveData()

    fun deleteTasks(id: String) = taskUseCase.deleteTasks(id)
}