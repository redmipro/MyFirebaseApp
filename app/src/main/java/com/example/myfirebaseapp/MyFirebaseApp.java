package com.example.myfirebaseapp;

import com.google.firebase.database.FirebaseDatabase;

public class MyFirebaseApp extends android.app.Application{

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        //llamar la persistencia para topda la app difernetes activity
    }
}
