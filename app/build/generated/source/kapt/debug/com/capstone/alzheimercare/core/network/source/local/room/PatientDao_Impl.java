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
import com.capstone.alzheimercare.core.network.source.local.entity.PatientEntity;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PatientDao_Impl implements PatientDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PatientEntity> __insertionAdapterOfPatientEntity;

  private final EntityDeletionOrUpdateAdapter<PatientEntity> __updateAdapterOfPatientEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePicturePatient;

  private final SharedSQLiteStatement __preparedStmtOfDeletePatient;

  public PatientDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPatientEntity = new EntityInsertionAdapter<PatientEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `patient` (`id`,`name`,`email`,`password`,`phoneNumber`,`dateBirth`,`address`,`gender`,`bloodType`,`picture`,`term`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientEntity value) {
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
        if (value.getBloodType() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getBloodType());
        }
        if (value.getPicture() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPicture());
        }
        final int _tmp;
        _tmp = value.getTerm() ? 1 : 0;
        stmt.bindLong(11, _tmp);
      }
    };
    this.__updateAdapterOfPatientEntity = new EntityDeletionOrUpdateAdapter<PatientEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `patient` SET `id` = ?,`name` = ?,`email` = ?,`password` = ?,`phoneNumber` = ?,`dateBirth` = ?,`address` = ?,`gender` = ?,`bloodType` = ?,`picture` = ?,`term` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientEntity value) {
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
        if (value.getBloodType() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getBloodType());
        }
        if (value.getPicture() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPicture());
        }
        final int _tmp;
        _tmp = value.getTerm() ? 1 : 0;
        stmt.bindLong(11, _tmp);
        if (value.getId() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getId());
        }
      }
    };
    this.__preparedStmtOfUpdatePicturePatient = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE patient SET picture=? WHERE id=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeletePatient = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM patient WHERE id=?";
        return _query;
      }
    };
  }

  @Override
  public long insertPatient(final PatientEntity patient) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfPatientEntity.insertAndReturnId(patient);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updatePatient(final PatientEntity patient) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPatientEntity.handle(patient);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updatePicturePatient(final String id, final String url) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePicturePatient.acquire();
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
      __preparedStmtOfUpdatePicturePatient.release(_stmt);
    }
  }

  @Override
  public void deletePatient(final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePatient.acquire();
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
      __preparedStmtOfDeletePatient.release(_stmt);
    }
  }

  @Override
  public Flow<List<PatientEntity>> getPatients() {
    final String _sql = "SELECT * FROM patient ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"patient"}, new Callable<List<PatientEntity>>() {
      @Override
      public List<PatientEntity> call() throws Exception {
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
          final int _cursorIndexOfBloodType = CursorUtil.getColumnIndexOrThrow(_cursor, "bloodType");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
          final int _cursorIndexOfTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "term");
          final List<PatientEntity> _result = new ArrayList<PatientEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PatientEntity _item;
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
            final String _tmpBloodType;
            _tmpBloodType = _cursor.getString(_cursorIndexOfBloodType);
            final String _tmpPicture;
            _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
            final boolean _tmpTerm;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfTerm);
            _tmpTerm = _tmp != 0;
            _item = new PatientEntity(_tmpId,_tmpName,_tmpEmail,_tmpPassword,_tmpPhoneNumber,_tmpDateBirth,_tmpAddress,_tmpGender,_tmpBloodType,_tmpPicture,_tmpTerm);
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
  public Flow<PatientEntity> getPatientDetail(final String id) {
    final String _sql = "SELECT * FROM patient WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"patient"}, new Callable<PatientEntity>() {
      @Override
      public PatientEntity call() throws Exception {
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
          final int _cursorIndexOfBloodType = CursorUtil.getColumnIndexOrThrow(_cursor, "bloodType");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
          final int _cursorIndexOfTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "term");
          final PatientEntity _result;
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
            final String _tmpBloodType;
            _tmpBloodType = _cursor.getString(_cursorIndexOfBloodType);
            final String _tmpPicture;
            _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
            final boolean _tmpTerm;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfTerm);
            _tmpTerm = _tmp != 0;
            _result = new PatientEntity(_tmpId,_tmpName,_tmpEmail,_tmpPassword,_tmpPhoneNumber,_tmpDateBirth,_tmpAddress,_tmpGender,_tmpBloodType,_tmpPicture,_tmpTerm);
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
  public Flow<PatientEntity> getPatient(final String email) {
    final String _sql = "SELECT * FROM patient WHERE email=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (email == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, email);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"patient"}, new Callable<PatientEntity>() {
      @Override
      public PatientEntity call() throws Exception {
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
          final int _cursorIndexOfBloodType = CursorUtil.getColumnIndexOrThrow(_cursor, "bloodType");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
          final int _cursorIndexOfTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "term");
          final PatientEntity _result;
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
            final String _tmpBloodType;
            _tmpBloodType = _cursor.getString(_cursorIndexOfBloodType);
            final String _tmpPicture;
            _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
            final boolean _tmpTerm;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfTerm);
            _tmpTerm = _tmp != 0;
            _result = new PatientEntity(_tmpId,_tmpName,_tmpEmail,_tmpPassword,_tmpPhoneNumber,_tmpDateBirth,_tmpAddress,_tmpGender,_tmpBloodType,_tmpPicture,_tmpTerm);
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
  public Flow<PatientEntity> getPatient(final String email, final String password) {
    final String _sql = "SELECT * FROM patient WHERE email=? AND password=?";
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
    return CoroutinesRoom.createFlow(__db, false, new String[]{"patient"}, new Callable<PatientEntity>() {
      @Override
      public PatientEntity call() throws Exception {
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
          final int _cursorIndexOfBloodType = CursorUtil.getColumnIndexOrThrow(_cursor, "bloodType");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
          final int _cursorIndexOfTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "term");
          final PatientEntity _result;
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
            final String _tmpBloodType;
            _tmpBloodType = _cursor.getString(_cursorIndexOfBloodType);
            final String _tmpPicture;
            _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
            final boolean _tmpTerm;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfTerm);
            _tmpTerm = _tmp != 0;
            _result = new PatientEntity(_tmpId,_tmpName,_tmpEmail,_tmpPassword,_tmpPhoneNumber,_tmpDateBirth,_tmpAddress,_tmpGender,_tmpBloodType,_tmpPicture,_tmpTerm);
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
