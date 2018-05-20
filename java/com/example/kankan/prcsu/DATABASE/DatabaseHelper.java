package com.example.kankan.prcsu.DATABASE;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

/**
     * Created by Sumit Mallick
     */
    public class DatabaseHelper extends SQLiteOpenHelper {
        public static final String DATABASE_NAME = "Resource.db";
        public static final String TABLE_NAME = "resource_table";

        public static final String COL_1 = "_ID";
        public static final String COL_2 = "EMAIL";
        public static final String COL_3 = "NAME";
        public static final String COL_4 = "PHONE";
        public static final String COL_5 = "DESCRIPTION";
        public static final String COL_6 = "TYPE";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, EMAIL TEXT,NAME TEXT,PHONE INTEGER,DESCRIPTION TEXT,TYPE TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String email,String name,String phone,String description,String type) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,email);
        contentValues.put(COL_3,name);
        contentValues.put(COL_4,phone);
        contentValues.put(COL_5,description);
        contentValues.put(COL_6,type);
        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }


        public Cursor getAllData() {
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
            return res;
        }



        public Integer deleteData (String id) {
            SQLiteDatabase db = this.getWritableDatabase();
            return db.delete(TABLE_NAME, "ID= ?",new String[] { });
        }
    }

