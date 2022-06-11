package com.capstone.alzheimercare.core.domain.usecase

import kotlinx.coroutines.flow.Flow
import com.capstone.alzheimercare.core.domain.model.Tasks
import com.capstone.alzheimercare.core.network.Resource

interface TaskUseCase {
    fun getTasks(idPatient: String): Flow<Resource<List<Tasks>>>
    fun getTasksDetail(id: String): Flow<Resource<Tasks>>
    fun insertTasks(task: Tasks)
    fun updateTasks(task: Tasks)
    fun deleteTasks(id: String)
}