package com.example.logutils;

import android.util.Log;

public class LogDebug {

    private static final String TAG="LibraryLogUtils";

public static void d(String message){
    Log.d(TAG,message);
}

}

