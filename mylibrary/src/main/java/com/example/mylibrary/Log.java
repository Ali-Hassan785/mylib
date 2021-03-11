package com.example.mylibrary;

public class Log {

    public static final String TAG = Log.class.getName();


    public static void ShowLog(String args) {

        android.util.Log.d(TAG, "d:  " + args);
        android.util.Log.d(TAG, "d:  " + args);

    }
}
