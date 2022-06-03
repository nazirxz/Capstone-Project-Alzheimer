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
import com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CaretakerDao_Impl implements CaretakerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CaretakerEntity> __insertionAdapterOfCaretakerEntity;

  private final EntityDeletionOrUpdateAdapter<CaretakerEntity> __updateAdapterOfCaretakerEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePictureCaretaker;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCaretaker;

  public CaretakerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCaretakerEntity = new EntityInsertionAdapter<CaretakerEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `caretaker` (`id`,`name`,`email`,`password`,`phoneNumber`,`dateBirth`,`address`,`gender`,`picture`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CaretakerEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPassword());
        }
        if (value.getPhoneNumber() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhoneNumber());
        }
        if (value.getDateBirth() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDateBirth());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAddress());
        }
        if (value.getGender() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getGender());
        }
        if (value.getPicture() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPicture());
        }
      }
    };
    this.__updateAdapterOfCaretakerEntity = new EntityDeletionOrUpdateAdapter<CaretakerEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `caretaker` SET `id` = ?,`name` = ?,`email` = ?,`password` = ?,`phoneNumber` = ?,`dateBirth` = ?,`address` = ?,`gender` = ?,`picture` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CaretakerEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPassword());
        }
        if (value.getPhoneNumber() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhoneNumber());
        }
        if (value.getDateBirth() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDateBirth());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAddress());
        }
        if (value.getGender() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getGender());
        }
        if (value.getPicture() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPicture());
        }
        if (value.getId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getId());
        }
      }
    };
    this.__preparedStmtOfUpdatePictureCaretaker = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE caretaker SET picture=? WHERE id=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCaretaker = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM caretaker WHERE id=?";
        return _query;
      }
    };
  }

  @Override
  public long insertCaretaker(final CaretakerEntity caretaker) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCaretakerEntity.insertAndReturnId(caretaker);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCaretaker(final CaretakerEntity caretaker) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCaretakerEntity.handle(caretaker);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updatePictureCaretaker(final String id, final String url) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePictureCaretaker.acquire();
    int _argIndex = 1;
    if (url == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, url);
    }
    _argIndex = 2;
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
      __preparedStmtOfUpdatePictureCaretaker.release(_stmt);
    }
  }

  @Override
  public void deleteCaretaker(final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCaretaker.acquire();
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
      __preparedStmtOfDeleteCaretaker.release(_stmt);
    }
  }

  @Override
  public Flow<List<CaretakerEntity>> getCaretaker() {
    final String _sql = "SELECT * FROM caretaker ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"caretaker"}, new Callable<List<CaretakerEntity>>() {
      @Override
      public List<CaretakerEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNumber");
          final int _cursorIndexOfDateBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "dateBirth");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
          final List<CaretakerEntity> _result = new ArrayList<CaretakerEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CaretakerEntity _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            final String _tmpPhoneNumber;
            _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
            final String _tmpDateBirth;
            _tmpDateBirth = _cursor.getString(_cursorIndexOfDateBirth);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpGender;
            _tmpGender = _cursor.getString(_cursorIndexOfGender);
            final String _tmpPicture;
            _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
            _item = new CaretakerEntity(_tmpId,_tmpName,_tmpEmail,_tmpPassword,_tmpPhoneNumber,_tmpDateBirth,_tmpAddress,_tmpGender,_tmpPicture);
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
  public Flow<CaretakerEntity> getCaretakerDetail(final String id) {
    final String _sql = "SELECT * FROM caretaker WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"caretaker"}, new Callable<CaretakerEntity>() {
      @Override
      public CaretakerEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNumber");
          final int _cursorIndexOfDateBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "dateBirth");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
          final CaretakerEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            final String _tmpPhoneNumber;
            _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
            final String _tmpDateBirth;
            _tmpDateBirth = _cursor.getString(_cursorIndexOfDateBirth);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpGender;
            _tmpGender = _cursor.getString(_cursorIndexOfGender);
            final String _tmpPicture;
            _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
            _result = new CaretakerEntity(_tmpId,_tmpName,_tmpEmail,_tmpPassword,_tmpPhoneNumber,_tmpDateBirth,_tmpAddress,_tmpGender,_tmpPicture);
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

  @Override
  public Flow<CaretakerEntity> getCaretaker(final String email) {
    final String _sql = "SELECT * FROM caretaker WHERE email=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (email == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, email);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"caretaker"}, new Callable<CaretakerEntity>() {
      @Override
      public CaretakerEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNumber");
          final int _cursorIndexOfDateBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "dateBirth");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
          final CaretakerEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            final String _tmpPhoneNumber;
            _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
            final String _tmpDateBirth;
            _tmpDateBirth = _cursor.getString(_cursorIndexOfDateBirth);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpGender;
            _tmpGender = _cursor.getString(_cursorIndexOfGender);
            final String _tmpPicture;
            _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
            _result = new CaretakerEntity(_tmpId,_tmpName,_tmpEmail,_tmpPassword,_tmpPhoneNumber,_tmpDateBirth,_tmpAddress,_tmpGender,_tmpPicture);
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

  @Override
  public Flow<CaretakerEntity> getCaretaker(final String email, final String password) {
    final String _sql = "SELECT * FROM caretaker WHERE email=? AND password=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (email == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, email);
    }
    _argIndex = 2;
    if (password == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, password);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"caretaker"}, new Callable<CaretakerEntity>() {
      @Override
      public CaretakerEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNumber");
          final int _cursorIndexOfDateBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "dateBirth");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
          final CaretakerEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            final String _tmpPhoneNumber;
            _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
            final String _tmpDateBirth;
            _tmpDateBirth = _cursor.getString(_cursorIndexOfDateBirth);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpGender;
            _tmpGender = _cursor.getString(_cursorIndexOfGender);
            final String _tmpPicture;
            _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
            _result = new CaretakerEntity(_tmpId,_tmpName,_tmpEmail,_tmpPassword,_tmpPhoneNumber,_tmpDateBirth,_tmpAddress,_tmpGender,_tmpPicture);
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
