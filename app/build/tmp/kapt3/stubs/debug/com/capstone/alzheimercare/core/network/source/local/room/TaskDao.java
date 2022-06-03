package com.capstone.alzheimercare.core.network.source.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/capstone/alzheimercare/core/network/source/local/room/TaskDao;", "", "deleteTasks", "", "id", "", "getTask", "Lkotlinx/coroutines/flow/Flow;", "Lcom/capstone/alzheimercare/core/network/source/local/entity/TaskEntity;", "getTasks", "", "idPatient", "insertTasks", "record", "updateTasks", "app_debug"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE idPatient=:idPatient ORDER BY timeStamp DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity>> getTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String idPatient);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE id=:id")
    public abstract kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity> getTask(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertTasks(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity record);
    
    @androidx.room.Update()
    public abstract void updateTasks(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity record);
    
    @androidx.room.Query(value = "DELETE FROM tasks WHERE id=:id")
    public abstract void deleteTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}