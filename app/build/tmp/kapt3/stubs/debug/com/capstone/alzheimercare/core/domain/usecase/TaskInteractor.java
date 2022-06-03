package com.capstone.alzheimercare.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/capstone/alzheimercare/core/domain/usecase/TaskInteractor;", "Lcom/capstone/alzheimercare/core/domain/usecase/TaskUseCase;", "repository", "Lcom/capstone/alzheimercare/core/domain/repository/IRepository;", "(Lcom/capstone/alzheimercare/core/domain/repository/IRepository;)V", "deleteTasks", "", "id", "", "getTasks", "Lkotlinx/coroutines/flow/Flow;", "Lcom/capstone/alzheimercare/core/network/Resource;", "", "Lcom/capstone/alzheimercare/core/domain/model/Tasks;", "idPatient", "getTasksDetail", "insertTasks", "task", "updateTasks", "app_debug"})
public final class TaskInteractor implements com.capstone.alzheimercare.core.domain.usecase.TaskUseCase {
    private final com.capstone.alzheimercare.core.domain.repository.IRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<java.util.List<com.capstone.alzheimercare.core.domain.model.Tasks>>> getTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String idPatient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Tasks>> getTasksDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @java.lang.Override()
    public void insertTasks(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Tasks task) {
    }
    
    @java.lang.Override()
    public void updateTasks(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Tasks task) {
    }
    
    @java.lang.Override()
    public void deleteTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public TaskInteractor(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.repository.IRepository repository) {
        super();
    }
}