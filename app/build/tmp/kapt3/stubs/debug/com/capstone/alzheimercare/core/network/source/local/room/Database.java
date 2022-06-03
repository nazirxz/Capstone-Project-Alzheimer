package com.capstone.alzheimercare.core.network.source.local.room;

import java.lang.System;

@androidx.room.Database(entities = {com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity.class, com.capstone.alzheimercare.core.network.source.local.entity.PatientEntity.class, com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/capstone/alzheimercare/core/network/source/local/room/Database;", "Landroidx/room/RoomDatabase;", "()V", "caretakerDao", "Lcom/capstone/alzheimercare/core/network/source/local/room/CaretakerDao;", "patientDao", "Lcom/capstone/alzheimercare/core/network/source/local/room/PatientDao;", "taskDao", "Lcom/capstone/alzheimercare/core/network/source/local/room/TaskDao;", "app_debug"})
public abstract class Database extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.capstone.alzheimercare.core.network.source.local.room.PatientDao patientDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.capstone.alzheimercare.core.network.source.local.room.CaretakerDao caretakerDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.capstone.alzheimercare.core.network.source.local.room.TaskDao taskDao();
    
    public Database() {
        super();
    }
}