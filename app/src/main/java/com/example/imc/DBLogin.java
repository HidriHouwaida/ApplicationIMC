package com.example.imc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBLogin extends SQLiteOpenHelper {
    public static final String name="client.db";
    public static final String TableName ="client_table";
    public static final String colomn1="NomClient";
    public static final String colomn2="MotDePasse";
    public static final String colomn3="Email";
    public static final String colomn4="Prenom";
    public static final String colomn5="AnneeNaissance";

    public DBLogin( Context context) {
        super(context, name, null, 1);
    }

    @Override
    // pour la creation de table
    public void onCreate( SQLiteDatabase db) {
        db.execSQL("create TABLE " +TableName+"(NomClient TEXT PRIMARY KEY,MotDePasse TEXT,Email TEXT,Prenom TEXT,AnneeNaissance TEXT)");

    }

    @Override
    //pour la mise à jours
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE if EXISTS "+TableName);
        onCreate(db);

    }

    //insertion des données
    public boolean insert( String NomClient, String MotDePasse, String Email,String Prenom,String AnneeNaissance)
    {   SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(colomn1,NomClient);
        contentValues.put(colomn2,MotDePasse);
        contentValues.put(colomn3,Email);
        contentValues.put(colomn4,Prenom);
        contentValues.put(colomn5,AnneeNaissance);
        long l=db.insert(TableName,null,contentValues);
        return l != -1;
    }
   
   
    //checkusername
    public boolean checkusername(String nom)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select NomClient from "+TableName+" where NomClient=?",new String[]{nom});
        return cursor.getCount() > 0;
    }
    //checkusernamepassword
    public boolean checkusernamepassword(String nom,String password)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select Email and MotDePasse from "+TableName+" where Email=? and MotDePasse=?",new String[]{nom,password});
        return cursor.getCount() > 0;
    }
    //getpassword
    public Cursor getMotDepasse(String nom)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        return db.rawQuery("Select MotDePasse from "+TableName+" where Email=?",new String[]{nom});
    }
}
