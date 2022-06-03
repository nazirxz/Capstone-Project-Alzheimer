package com.capstone.alzheimercare.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\bH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\nH\u0016J\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/capstone/alzheimercare/core/domain/usecase/PatientInteractor;", "Lcom/capstone/alzheimercare/core/domain/usecase/PatientUseCase;", "repository", "Lcom/capstone/alzheimercare/core/domain/repository/IRepository;", "(Lcom/capstone/alzheimercare/core/domain/repository/IRepository;)V", "deletePatient", "", "id", "", "getPatient", "Lkotlinx/coroutines/flow/Flow;", "Lcom/capstone/alzheimercare/core/network/Resource;", "Lcom/capstone/alzheimercare/core/domain/model/Patient;", "email", "getPatientDetail", "getPatients", "", "insertPatient", "patient", "(Lcom/capstone/alzheimercare/core/domain/model/Patient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePatient", "updatePicturePatient", "url", "app_debug"})
public final class PatientInteractor implements com.capstone.alzheimercare.core.domain.usecase.PatientUseCase {
    private final com.capstone.alzheimercare.core.domain.repository.IRepository repository = null;
    
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
    
    public PatientInteractor(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.repository.IRepository repository) {
        super();
    }
}