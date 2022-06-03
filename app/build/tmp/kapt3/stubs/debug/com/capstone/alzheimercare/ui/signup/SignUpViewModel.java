package com.capstone.alzheimercare.ui.signup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0014\u001a\u00020\tJ\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00120\u00112\u0006\u0010\u0014\u001a\u00020\tJ\u0019\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\tJ\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/capstone/alzheimercare/ui/signup/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "patientUseCase", "Lcom/capstone/alzheimercare/core/domain/usecase/PatientUseCase;", "caretakerUseCase", "Lcom/capstone/alzheimercare/core/domain/usecase/CaretakerUseCase;", "(Lcom/capstone/alzheimercare/core/domain/usecase/PatientUseCase;Lcom/capstone/alzheimercare/core/domain/usecase/CaretakerUseCase;)V", "_email", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_password", "_repeat", "isSubmitEnabled", "Lkotlinx/coroutines/flow/Flow;", "", "()Lkotlinx/coroutines/flow/Flow;", "checkCaretaker", "Landroidx/lifecycle/LiveData;", "Lcom/capstone/alzheimercare/core/network/Resource;", "Lcom/capstone/alzheimercare/core/domain/model/Caretaker;", "email", "checkPatient", "Lcom/capstone/alzheimercare/core/domain/model/Patient;", "insertCaretaker", "caretaker", "(Lcom/capstone/alzheimercare/core/domain/model/Caretaker;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPatient", "patient", "(Lcom/capstone/alzheimercare/core/domain/model/Patient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEmail", "", "setPassword", "password", "setRepeat", "repeat", "app_debug"})
public final class SignUpViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _email = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _password = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _repeat = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isSubmitEnabled = null;
    private final com.capstone.alzheimercare.core.domain.usecase.PatientUseCase patientUseCase = null;
    private final com.capstone.alzheimercare.core.domain.usecase.CaretakerUseCase caretakerUseCase = null;
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void setRepeat(@org.jetbrains.annotations.NotNull()
    java.lang.String repeat) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isSubmitEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertPatient(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Patient patient, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Caretaker caretaker, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Patient>> checkPatient(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Caretaker>> checkCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    public SignUpViewModel(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.usecase.PatientUseCase patientUseCase, @org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.usecase.CaretakerUseCase caretakerUseCase) {
        super();
    }
}