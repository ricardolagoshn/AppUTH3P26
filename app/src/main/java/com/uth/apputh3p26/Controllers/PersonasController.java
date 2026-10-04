package com.uth.apputh3p26.Controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.uth.apputh3p26.Database.DatabaseHelper;
import com.uth.apputh3p26.Models.Personas;

public class PersonasController
{
    private final DatabaseHelper databaseHelper;

    public PersonasController(Context context)
    {
        databaseHelper = new DatabaseHelper(context);
    }
}
