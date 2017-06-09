package sxmxlp.gmail.com.finalapp.utils;

import android.util.Log;

import sxmxlp.gmail.com.finalapp.BuildConfig;

/**
 * Created by Lee on 2017/6/9.
 */

final public class LogUtils {
    private static boolean enabled = BuildConfig.DEBUG;

    public static void d(String tag, String message) {
        if (enabled) {
            Log.d(tag, message);
        }
    }
}
