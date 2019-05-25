package com.cut2it.logg;

import android.util.Log;

public class LogDebug {

    private static final String TAG="SUPER_AWESOM_APP";

    public static void d(String msg){
        Log.d(TAG, msg);
    }
}
