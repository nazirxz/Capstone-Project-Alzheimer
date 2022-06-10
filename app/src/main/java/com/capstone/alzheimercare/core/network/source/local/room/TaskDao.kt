package com.capstone.alzheimercare.core.network.source.local.room

import androidx.room.*
import com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks WHERE idPatient=:idPatient ORDER BY timeStamp DESC")
    fun getTasks(idPatient: String): Flow<List<TaskEntity>>

    @Query("SELECT * FROM tasks WHERE id=:idCaretaker")
    fun getTask(idCaretaker: String): Flow<TaskEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertTasks(record: TaskEntity)

    @Update
    fun updateTasks(record: TaskEntity)

    @Query("DELETE FROM tasks WHERE id=:id")
    fun deleteTasks(id: String)
}