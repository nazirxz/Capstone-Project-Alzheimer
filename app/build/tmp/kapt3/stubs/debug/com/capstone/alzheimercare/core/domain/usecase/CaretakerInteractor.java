package com.capstone.alzheimercare.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\r0\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\r0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/capstone/alzheimercare/core/domain/usecase/CaretakerInteractor;", "Lcom/capstone/alzheimercare/core/domain/usecase/CaretakerUseCase;", "repository", "Lcom/capstone/alzheimercare/core/domain/repository/IRepository;", "(Lcom/capstone/alzheimercare/core/domain/repository/IRepository;)V", "deleteCaretaker", "", "id", "", "getCaretaker", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/capstone/alzheimercare/core/domain/model/Caretaker;", "Lcom/capstone/alzheimercare/core/network/Resource;", "email", "getCaretakerDetail", "insertCaretaker", "caretaker", "(Lcom/capstone/alzheimercare/core/domain/model/Caretaker;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCaretaker", "updatePictureCaretaker", "url", "app_debug"})
public final class CaretakerInteractor implements com.capstone.alzheimercare.core.domain.usecase.CaretakerUseCase {
    private final com.capstone.alzheimercare.core.domain.repository.IRepository repository = null;
    
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
    com.capstone.alzheimercare.core.domain.model.Caretaker caretaker, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    @java.lang.Override()
    public void updateCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Caretaker caretaker) {
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
    
    public CaretakerInteractor(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.repository.IRepository repository) {
        super();
    }
}