package com.example.mobileapp_project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB extends SQLiteOpenHelper {
    public static final String DBNAME = "MobileApp_project.db";


    public DB(Context context) {
        super(context, "MobileApp_project.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table signup(firstname TEXT primary key, lastname TEXT , email TEXT , password TEXT, confiormpassword TEXT , number TEXT)");
        MyDB.execSQL("create Table login(email TEXT primary key, password TEXT)");
        MyDB.execSQL("create Table contactUs(username TEXT primary key, number TEXT, message TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int oldVersion, int newVersion) {
        MyDB.execSQL("drop Table if exists signup");
        MyDB.execSQL("drop Table if exists login");
        MyDB.execSQL("drop table if exists contactUs");
    }

    public Boolean insertData(String fullname, String email, String username, String password) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("fullname", fullname);
        contentValues.put("email", email);
        contentValues.put("username", username);
        contentValues.put("password", password);
        long result = MyDB.insert("users", null, contentValues);
        if (result == -1) return false;
        else
            return true;
    }

    public Boolean insertadmin(String fullname, String email, String username, String password) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("fullname", fullname);
        contentValues.put("email", email);
        contentValues.put("username", username);
        contentValues.put("password", password);
        long result = MyDB.insert("admin", null, contentValues);
        if (result == -1) return false;
        else
            return true;
    }

    public boolean checkusername(String username) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where username = ?", new String[]{username});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public boolean checkadminusername(String username) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from admin where username = ?", new String[]{username});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public boolean checkusernamepassword(String username, String password) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where username = ? and password = ?", new String[]{username, password});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public boolean checkadminusernamepassword(String username, String password) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from admin where username = ? and password = ?", new String[]{username, password});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public Boolean insertBus(String id, String departure, String arrival, String date, String total_seats) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", id);
        contentValues.put("departure", departure);
        contentValues.put("arrival", arrival);
        contentValues.put("date", date);
        contentValues.put("total_seats", total_seats);
        long result = MyDB.insert("buses", null, contentValues);
        if (result == -1) return false;
        else
            return true;
    }

    public Boolean updateBus(String id, String departure, String arrival, String date, String total_seats) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("departure", departure);
        contentValues.put("arrival", arrival);
        contentValues.put("date", date);
        contentValues.put("total_seats", total_seats);
        Cursor cursor = MyDB.rawQuery("Select * from buses where id = ?", new String[]{id});
        if (cursor.getCount() > 0) {
            long result = MyDB.update("buses", contentValues, "id=?", new String[]{id});
            if (result == -1) return false;
            else
                return true;
        } else {
            return false;
        }
    }

    public Boolean deleteBus(String id) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from buses where id = ?", new String[]{id});
        if (cursor.getCount() > 0) {
            long result = MyDB.delete("buses", "id=?", new String[]{id});
            if (result == -1) return false;
            else
                return true;
        } else {
            return false;
        }
    }

    public Cursor viewbuses() {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from buses", null);
        return cursor;
    }

    /*public Cursor getListContents(){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor data = MyDB.rawQuery("Select * from buses", null);
        return data;*/


    public boolean checkid(String id) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from buses where id = ?", new String[]{id});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }
}















