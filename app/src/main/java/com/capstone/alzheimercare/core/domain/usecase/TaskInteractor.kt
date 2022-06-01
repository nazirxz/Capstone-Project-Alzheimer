package com.capstone.alzheimercare.core.domain.usecase

import com.capstone.alzheimercare.core.domain.model.Tasks
import com.capstone.alzheimercare.core.domain.repository.IRepository

class TaskInteractor(private val repository: IRepository): TaskUseCase {
    override fun getTasks(idPatient: String) = repository.getTasks(idPatient)
    override fun getTasksDetail(id: String) = repository.getTasksDetail(id)
    override fun insertTasks(task: Tasks) = repository.insertTasks(task)
    override fun updateTasks(task: Tasks) = repository.updateTasks(task)
    override fun deleteTasks(id: String) = repository.deleteTasks(id)
}