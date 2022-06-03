package com.capstone.alzheimercare.core.network.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0013\u001a\u00020\fJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0013\u001a\u00020\fJ\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00110\u0010J\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00110\u00102\u0006\u0010\u001c\u001a\u00020\fJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0012J\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u001bJ\u000e\u0010%\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0012J\u000e\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0017J\u0016\u0010\'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fJ\u0016\u0010)\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fJ\u000e\u0010*\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/capstone/alzheimercare/core/network/source/local/LocalDataSource;", "", "patientDao", "Lcom/capstone/alzheimercare/core/network/source/local/room/PatientDao;", "caretakerDao", "Lcom/capstone/alzheimercare/core/network/source/local/room/CaretakerDao;", "taskDao", "Lcom/capstone/alzheimercare/core/network/source/local/room/TaskDao;", "(Lcom/capstone/alzheimercare/core/network/source/local/room/PatientDao;Lcom/capstone/alzheimercare/core/network/source/local/room/CaretakerDao;Lcom/capstone/alzheimercare/core/network/source/local/room/TaskDao;)V", "deleteCaretaker", "", "id", "", "deletePatient", "deleteTasks", "getCaretaker", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/capstone/alzheimercare/core/network/source/local/entity/CaretakerEntity;", "email", "password", "getCaretakerDetail", "getPatient", "Lcom/capstone/alzheimercare/core/network/source/local/entity/PatientEntity;", "getPatientDetail", "getPatients", "getTasks", "Lcom/capstone/alzheimercare/core/network/source/local/entity/TaskEntity;", "idPatient", "getTasksDetail", "insertCaretaker", "", "caretaker", "insertPatient", "patient", "insertTasks", "task", "updateCaretaker", "updatePatient", "updatePictureCaretaker", "url", "updatePicturePatient", "updateTasks", "app_debug"})
public final class LocalDataSource {
    private final com.capstone.alzheimercare.core.network.source.local.room.PatientDao patientDao = null;
    private final com.capstone.alzheimercare.core.network.source.local.room.CaretakerDao caretakerDao = null;
    private final com.capstone.alzheimercare.core.network.source.local.room.TaskDao taskDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.capstone.alzheimercare.core.network.source.local.entity.PatientEntity>> getPatients() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.local.entity.PatientEntity> getPatientDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.local.entity.PatientEntity> getPatient(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.local.entity.PatientEntity> getPatient(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    public final long insertPatient(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.entity.PatientEntity patient) {
        return 0L;
    }
    
    public final void updatePatient(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.entity.PatientEntity patient) {
    }
    
    public final void updatePicturePatient(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void deletePatient(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity>> getCaretaker() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity> getCaretakerDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity> getCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity> getCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    public final long insertCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity caretaker) {
        return 0L;
    }
    
    public final void updateCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity caretaker) {
    }
    
    public final void updatePictureCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void deleteCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity>> getTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String idPatient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity> getTasksDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public final void insertTasks(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity task) {
    }
    
    public final void updateTasks(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity task) {
    }
    
    public final void deleteTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.room.PatientDao patientDao, @org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.room.CaretakerDao caretakerDao, @org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.room.TaskDao taskDao) {
        super();
    }
}