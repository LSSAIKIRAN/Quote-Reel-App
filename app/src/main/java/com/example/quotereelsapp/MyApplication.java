package com.example.quotereelsapp;

import android.app.Application;

import com.google.firebase.firestore.FirebaseFirestore;

public class MyApplication extends Application {

    public static FirebaseFirestore firestore;

    @Override
    public void onCreate() {
        super.onCreate();
        firestore = FirebaseFirestore.getInstance();
    }
}
