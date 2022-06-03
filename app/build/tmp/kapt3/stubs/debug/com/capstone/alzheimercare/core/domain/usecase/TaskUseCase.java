package com.capstone.alzheimercare.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00072\u0006\u0010\u000b\u001a\u00020\u0005H&J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH&\u00a8\u0006\u0010"}, d2 = {"Lcom/capstone/alzheimercare/core/domain/usecase/TaskUseCase;", "", "deleteTasks", "", "id", "", "getTasks", "Lkotlinx/coroutines/flow/Flow;", "Lcom/capstone/alzheimercare/core/network/Resource;", "", "Lcom/capstone/alzheimercare/core/domain/model/Tasks;", "idPatient", "getTasksDetail", "insertTasks", "task", "updateTasks", "app_debug"})
public abstract interface TaskUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<java.util.List<com.capstone.alzheimercare.core.domain.model.Tasks>>> getTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String idPatient);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Tasks>> getTasksDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    public abstract void insertTasks(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Tasks task);
    
    public abstract void updateTasks(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Tasks task);
    
    public abstract void deleteTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}