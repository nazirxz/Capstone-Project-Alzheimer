package com.capstone.alzheimercare.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u0005H&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u0007H&J\u0019\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/capstone/alzheimercare/core/domain/usecase/PatientUseCase;", "", "deletePatient", "", "id", "", "getPatient", "Lkotlinx/coroutines/flow/Flow;", "Lcom/capstone/alzheimercare/core/network/Resource;", "Lcom/capstone/alzheimercare/core/domain/model/Patient;", "email", "getPatientDetail", "getPatients", "", "insertPatient", "patient", "(Lcom/capstone/alzheimercare/core/domain/model/Patient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePatient", "updatePicturePatient", "url", "app_debug"})
public abstract interface PatientUseCase {
    
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
}