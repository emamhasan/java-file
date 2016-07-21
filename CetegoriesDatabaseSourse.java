package com.example.dhkansat.librarymenagement.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.dhkansat.librarymenagement.Model.CetegoriesBook;

/**
 * Created by DH Kansat on 7/20/2016.
 */
public class CetegoriesDatabaseSourse {
    SQLiteDatabase database;
    DatabaseHelper databaseHelper;
    CetegoriesBook cetegoriesBook;
    public CetegoriesDatabaseSourse(Context context){
        databaseHelper=new DatabaseHelper(context);
    }
    public void open(){
        databaseHelper.getWritableDatabase();
    }
    public void close(){
        databaseHelper.close();
    }
    public boolean AddBookCetegories(CetegoriesBook cetegoriesBook){
        this.open();
        ContentValues contentValues=new ContentValues();
        contentValues.put(databaseHelper.COL_NAME,cetegoriesBook.getCetegoriesNameBook());
        database.insert(databaseHelper.TABLE_NAME,null,contentValues);
        this.close();
        return true;
    }
}
