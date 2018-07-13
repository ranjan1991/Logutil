package com.r.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG="AWESOME_LIB_LOG";
    public static void d(String message){
        Log.d(TAG,message);
    }
}
