package com.example.mylibrary;

public class Log {

    public static final String TAG = Log.class.getName();


    public static void d(String args) {

        android.util.Log.d(TAG, "d:  "+args);

    }
}
