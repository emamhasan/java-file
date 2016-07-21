package com.example.dhkansat.librarymenagement.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by DH Kansat on 7/20/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper{
    static final int DATABASE_VERSON=1;
    static final String DATABASE_NAME="Library";
    static final String TABLE_NAME="Book Cetegories";
    static final String COL_ID="ID";
    static final String COL_NAME="Name";
    static final String CREATE_TABLE="create table"+TABLE_NAME+"("+COL_ID+"integer primary key ,"+COL_NAME+"text primary key);";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSON);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exits"+TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
