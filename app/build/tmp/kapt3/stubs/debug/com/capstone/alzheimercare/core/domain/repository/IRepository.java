package com.capstone.alzheimercare.core.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\f0\t2\u0006\u0010\r\u001a\u00020\u0005H&J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\f0\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\t2\u0006\u0010\r\u001a\u00020\u0005H&J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\tH&J\"\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\f0\t2\u0006\u0010\u0015\u001a\u00020\u0005H&J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0019\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0014H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000bH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0010H&J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H&J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0014H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/capstone/alzheimercare/core/domain/repository/IRepository;", "", "deleteCaretaker", "", "id", "", "deletePatient", "deleteTasks", "getCaretaker", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/capstone/alzheimercare/core/domain/model/Caretaker;", "Lcom/capstone/alzheimercare/core/network/Resource;", "email", "getCaretakerDetail", "getPatient", "Lcom/capstone/alzheimercare/core/domain/model/Patient;", "getPatientDetail", "getPatients", "getTasks", "Lcom/capstone/alzheimercare/core/domain/model/Tasks;", "idPatient", "getTasksDetail", "insertCaretaker", "caretaker", "(Lcom/capstone/alzheimercare/core/domain/model/Caretaker;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPatient", "patient", "(Lcom/capstone/alzheimercare/core/domain/model/Patient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTasks", "task", "updateCaretaker", "updatePatient", "updatePictureCaretaker", "url", "updatePicturePatient", "updateTasks", "app_debug"})
public abstract interface IRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.capstone.alzheimercare.core.domain.model.Patient>> getPatients();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Patient>> getPatientDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Patient>> getPatient(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertPatient(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Patient patient, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1);
    
    public abstract void updatePatient(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Patient patient);
    
    public abstract void updatePicturePatient(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    public abstract void deletePatient(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
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
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.capstone.alzheimercare.core.domain.model.Caretaker>> getCaretaker();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Caretaker>> getCaretakerDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Caretaker>> getCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Caretaker caretaker, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1);
    
    public abstract void updateCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Caretaker caretaker);
    
    public abstract void updatePictureCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    public abstract void deleteCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}