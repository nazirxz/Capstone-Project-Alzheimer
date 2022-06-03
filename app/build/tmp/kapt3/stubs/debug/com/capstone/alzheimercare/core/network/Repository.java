package com.capstone.alzheimercare.core.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0016J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00110\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00110\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u000eH\u0016J\"\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000f0\u00110\u000e2\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0019\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0019H\u0016J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\u0010\u0010%\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0015H\u0016J\u0018\u0010&\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\nH\u0016J\u0018\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\nH\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/capstone/alzheimercare/core/network/Repository;", "Lcom/capstone/alzheimercare/core/domain/repository/IRepository;", "localDataSource", "Lcom/capstone/alzheimercare/core/network/source/local/LocalDataSource;", "remoteDataSource", "Lcom/capstone/alzheimercare/core/network/source/remote/RemoteDataSource;", "(Lcom/capstone/alzheimercare/core/network/source/local/LocalDataSource;Lcom/capstone/alzheimercare/core/network/source/remote/RemoteDataSource;)V", "deleteCaretaker", "", "id", "", "deletePatient", "deleteTasks", "getCaretaker", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/capstone/alzheimercare/core/domain/model/Caretaker;", "Lcom/capstone/alzheimercare/core/network/Resource;", "email", "getCaretakerDetail", "getPatient", "Lcom/capstone/alzheimercare/core/domain/model/Patient;", "getPatientDetail", "getPatients", "getTasks", "Lcom/capstone/alzheimercare/core/domain/model/Tasks;", "idPatient", "getTasksDetail", "insertCaretaker", "Caretaker", "(Lcom/capstone/alzheimercare/core/domain/model/Caretaker;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPatient", "patient", "(Lcom/capstone/alzheimercare/core/domain/model/Patient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTasks", "task", "updateCaretaker", "updatePatient", "updatePictureCaretaker", "url", "updatePicturePatient", "updateTasks", "app_debug"})
public final class Repository implements com.capstone.alzheimercare.core.domain.repository.IRepository {
    private final com.capstone.alzheimercare.core.network.source.local.LocalDataSource localDataSource = null;
    private final com.capstone.alzheimercare.core.network.source.remote.RemoteDataSource remoteDataSource = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.capstone.alzheimercare.core.domain.model.Patient>> getPatients() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Patient>> getPatientDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Patient>> getPatient(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertPatient(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Patient patient, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    @java.lang.Override()
    public void updatePatient(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Patient patient) {
    }
    
    @java.lang.Override()
    public void updatePicturePatient(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void deletePatient(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.capstone.alzheimercare.core.domain.model.Caretaker>> getCaretaker() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Caretaker>> getCaretakerDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Caretaker>> getCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Caretaker Caretaker, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    @java.lang.Override()
    public void updateCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Caretaker Caretaker) {
    }
    
    @java.lang.Override()
    public void updatePictureCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void deleteCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public Repository(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.LocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.remote.RemoteDataSource remoteDataSource) {
        super();
    }
}