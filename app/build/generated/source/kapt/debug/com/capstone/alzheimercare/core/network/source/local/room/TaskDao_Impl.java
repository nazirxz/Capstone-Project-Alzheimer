package com.capstone.alzheimercare.core.network.source.local.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.capstone.alzheimercare.core.network.source.local.entity.TaskEntity;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TaskEntity> __insertionAdapterOfTaskEntity;

  private final EntityDeletionOrUpdateAdapter<TaskEntity> __updateAdapterOfTaskEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTasks;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTaskEntity = new EntityInsertionAdapter<TaskEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `tasks` (`id`,`taskName`,`timeStamp`,`idCaretaker`,`idPatient`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTaskName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTaskName());
        }
        if (value.getTimeStamp() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTimeStamp());
        }
        if (value.getIdCaretaker() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIdCaretaker());
        }
        if (value.getIdPatient() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIdPatient());
        }
      }
    };
    this.__updateAdapterOfTaskEntity = new EntityDeletionOrUpdateAdapter<TaskEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `tasks` SET `id` = ?,`taskName` = ?,`timeStamp` = ?,`idCaretaker` = ?,`idPatient` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTaskName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTaskName());
        }
        if (value.getTimeStamp() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTimeStamp());
        }
        if (value.getIdCaretaker() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIdCaretaker());
        }
        if (value.getIdPatient() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIdPatient());
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteTasks = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM tasks WHERE id=?";
        return _query;
      }
    };
  }

  @Override
  public void insertTasks(final TaskEntity record) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTaskEntity.insert(record);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTasks(final TaskEntity record) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTaskEntity.handle(record);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTasks(final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTasks.acquire();
    int _argIndex = 1;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTasks.release(_stmt);
    }
  }

  @Override
  public Flow<List<TaskEntity>> getTasks(final String idPatient) {
    final String _sql = "SELECT * FROM tasks WHERE idPatient=? ORDER BY timeStamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (idPatient == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, idPatient);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tasks"}, new Callable<List<TaskEntity>>() {
      @Override
      public List<TaskEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTaskName = CursorUtil.getColumnIndexOrThrow(_cursor, "taskName");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfIdCaretaker = CursorUtil.getColumnIndexOrThrow(_cursor, "idCaretaker");
          final int _cursorIndexOfIdPatient = CursorUtil.getColumnIndexOrThrow(_cursor, "idPatient");
          final List<TaskEntity> _result = new ArrayList<TaskEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TaskEntity _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTaskName;
            _tmpTaskName = _cursor.getString(_cursorIndexOfTaskName);
            final String _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getString(_cursorIndexOfTimeStamp);
            final String _tmpIdCaretaker;
            _tmpIdCaretaker = _cursor.getString(_cursorIndexOfIdCaretaker);
            final String _tmpIdPatient;
            _tmpIdPatient = _cursor.getString(_cursorIndexOfIdPatient);
            _item = new TaskEntity(_tmpId,_tmpTaskName,_tmpTimeStamp,_tmpIdCaretaker,_tmpIdPatient);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<TaskEntity> getTask(final String id) {
    final String _sql = "SELECT * FROM tasks WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tasks"}, new Callable<TaskEntity>() {
      @Override
      public TaskEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTaskName = CursorUtil.getColumnIndexOrThrow(_cursor, "taskName");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfIdCaretaker = CursorUtil.getColumnIndexOrThrow(_cursor, "idCaretaker");
          final int _cursorIndexOfIdPatient = CursorUtil.getColumnIndexOrThrow(_cursor, "idPatient");
          final TaskEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTaskName;
            _tmpTaskName = _cursor.getString(_cursorIndexOfTaskName);
            final String _tmpTimeStamp;
            _tmpTimeStamp = _cursor.getString(_cursorIndexOfTimeStamp);
            final String _tmpIdCaretaker;
            _tmpIdCaretaker = _cursor.getString(_cursorIndexOfIdCaretaker);
            final String _tmpIdPatient;
            _tmpIdPatient = _cursor.getString(_cursorIndexOfIdPatient);
            _result = new TaskEntity(_tmpId,_tmpTaskName,_tmpTimeStamp,_tmpIdCaretaker,_tmpIdPatient);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
