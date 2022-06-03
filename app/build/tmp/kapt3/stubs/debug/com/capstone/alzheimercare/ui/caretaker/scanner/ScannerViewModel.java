package com.capstone.alzheimercare.ui.caretaker.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/capstone/alzheimercare/ui/caretaker/scanner/ScannerViewModel;", "Landroidx/lifecycle/ViewModel;", "caretakerUseCase", "Lcom/capstone/alzheimercare/core/domain/usecase/CaretakerUseCase;", "taskUseCase", "Lcom/capstone/alzheimercare/core/domain/usecase/TaskUseCase;", "(Lcom/capstone/alzheimercare/core/domain/usecase/CaretakerUseCase;Lcom/capstone/alzheimercare/core/domain/usecase/TaskUseCase;)V", "getCaretaker", "Landroidx/lifecycle/LiveData;", "Lcom/capstone/alzheimercare/core/network/Resource;", "Lcom/capstone/alzheimercare/core/domain/model/Caretaker;", "id", "", "insert", "", "task", "Lcom/capstone/alzheimercare/core/domain/model/Tasks;", "app_debug"})
public final class ScannerViewModel extends androidx.lifecycle.ViewModel {
    private final com.capstone.alzheimercare.core.domain.usecase.CaretakerUseCase caretakerUseCase = null;
    private final com.capstone.alzheimercare.core.domain.usecase.TaskUseCase taskUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.capstone.alzheimercare.core.network.Resource<com.capstone.alzheimercare.core.domain.model.Caretaker>> getCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.model.Tasks task) {
    }
    
    public ScannerViewModel(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.usecase.CaretakerUseCase caretakerUseCase, @org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.domain.usecase.TaskUseCase taskUseCase) {
        super();
    }
}