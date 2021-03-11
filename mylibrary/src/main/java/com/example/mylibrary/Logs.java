package com.example.mylibrary;

public class Logs {

    public static final String TAG = Logs.class.getName();


    public static void ShowLog(String args) {

        android.util.Log.d(TAG, "d:  " + args);
        android.util.Log.d(TAG, "d:  " + args);

    }
}
