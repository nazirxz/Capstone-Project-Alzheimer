package com.capstone.alzheimercare.ui.patient.home


import com.capstone.alzheimercare.core.domain.model.Tasks

interface TaskCallback {
    fun onItemClick(task: Tasks)
}