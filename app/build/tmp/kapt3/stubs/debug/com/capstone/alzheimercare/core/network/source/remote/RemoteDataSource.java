package com.capstone.alzheimercare.core.network.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\fJ\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u00102\u0006\u0010\u0013\u001a\u00020\fJ\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u00102\u0006\u0010\u000b\u001a\u00020\fJ \u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00110\u00102\u0006\u0010\u001b\u001a\u00020\fJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u0019\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001aJ\u000e\u0010%\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0012J\u000e\u0010&\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0016J\u0016\u0010\'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fJ\u0016\u0010)\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fJ\u000e\u0010*\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/capstone/alzheimercare/core/network/source/remote/RemoteDataSource;", "", "()V", "caretakerDb", "Lcom/google/firebase/firestore/CollectionReference;", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "patientDb", "taskDb", "deleteCaretaker", "", "id", "", "deletePatient", "deleteTasks", "getCaretaker", "Lkotlinx/coroutines/flow/Flow;", "Lcom/capstone/alzheimercare/core/network/source/remote/ApiResponse;", "Lcom/capstone/alzheimercare/core/network/source/remote/response/CaretakerResponse;", "email", "getCaretakerDetail", "getPatient", "Lcom/capstone/alzheimercare/core/network/source/remote/response/PatientResponse;", "getPatientDetail", "getTasks", "", "Lcom/capstone/alzheimercare/core/network/source/remote/response/TasksResponse;", "idPatient", "getTasksDetail", "insertCaretaker", "caretaker", "(Lcom/capstone/alzheimercare/core/network/source/remote/response/CaretakerResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPatient", "patient", "(Lcom/capstone/alzheimercare/core/network/source/remote/response/PatientResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTasks", "task", "updateCaretaker", "updatePatient", "updatePictureCaretaker", "uri", "updatePicturePatient", "updateTasks", "app_debug"})
public final class RemoteDataSource {
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    private final com.google.firebase.firestore.CollectionReference patientDb = null;
    private final com.google.firebase.firestore.CollectionReference caretakerDb = null;
    private final com.google.firebase.firestore.CollectionReference taskDb = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.remote.ApiResponse<java.util.List<com.capstone.alzheimercare.core.network.source.remote.response.TasksResponse>>> getTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String idPatient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.remote.ApiResponse<com.capstone.alzheimercare.core.network.source.remote.response.TasksResponse>> getTasksDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String insertTasks(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.remote.response.TasksResponse task) {
        return null;
    }
    
    public final void updateTasks(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.remote.response.TasksResponse task) {
    }
    
    public final void deleteTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.remote.ApiResponse<com.capstone.alzheimercare.core.network.source.remote.response.PatientResponse>> getPatient(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.remote.ApiResponse<com.capstone.alzheimercare.core.network.source.remote.response.PatientResponse>> getPatientDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertPatient(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.remote.response.PatientResponse patient, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    public final void updatePatient(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.remote.response.PatientResponse patient) {
    }
    
    public final void updatePicturePatient(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    public final void deletePatient(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.remote.ApiResponse<com.capstone.alzheimercare.core.network.source.remote.response.CaretakerResponse>> getCaretakerDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.remote.ApiResponse<com.capstone.alzheimercare.core.network.source.remote.response.CaretakerResponse>> getCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.remote.response.CaretakerResponse caretaker, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    public final void updateCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.remote.response.CaretakerResponse caretaker) {
    }
    
    public final void updatePictureCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    public final void deleteCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public RemoteDataSource() {
        super();
    }
}