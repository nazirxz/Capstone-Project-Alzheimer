package com.capstone.alzheimercare.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\tJ\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00110\u00102\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/capstone/alzheimercare/ui/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "patientUseCase", "Lcom/capstone/alzheimercare/core/domain/usecase/PatientUseCase;", "caretakerUseCase", "Lcom/capstone/alzheimercare/core/domain/usecase/CaretakerUseCase;", "(Lcom/capstone/alzheimercare/core/domain/usecase/PatientUseCase;Lcom/capstone/alzheimercare/core/domain/usecase/CaretakerUseCase;)V", "_email", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_password", "isSubmitEnabled", "Lkotlinx/coroutines/flow/Flow;", "", "()Lkotlinx/coroutines/flow/Flow;", "checkCaretaker", "Landroidx/lifecycle/LiveData;", "Lcom/capstone/alzheimercare/core/network/Resource;", "Lcom/capstone/alzheimercare/core/domain/model/Caretaker;", "email", "checkPatient", "Lcom/capstone/alzheimercare/core/domain/model/Patient;", "setEmail", "", "name", "setPassword", "password", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _email = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _password = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isSubmitEnabled = null;
    private final com.capstone.alzheimercare.core.domain.usecase.PatientUseCase patientUseCase = null;
    private final com.capstone.alzheimercare.core.domain.usecase.CaretakerUseCase caretakerUseCase = null;
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isSubmitEnabled() {
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
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.usecase.PatientUseCase patientUseCase, @org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.usecase.CaretakerUseCase caretakerUseCase) {
        super();
    }
}