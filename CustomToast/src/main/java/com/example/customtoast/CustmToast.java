package com.example.customtoast;

import android.content.Context;
import android.widget.Toast;

public class CustmToast {


    public static final String TAG = CustmToast.class.getName();

    public static void ShowToast(Context context, String s, int time) {
        Toast.makeText(context, s, time).show();
    }
}
