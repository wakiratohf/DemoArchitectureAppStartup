package com.architecture.appstartup

import android.util.Log

class AppLogger(private val debugMode: Boolean) {
    private val TAG = "AppLogger"

    fun logD(msg: String) {
        if (debugMode) {
            Log.d(TAG, msg);
        }
    }

    companion object {
        private var instance: AppLogger? = null
        fun init(debugMode: Boolean): AppLogger {
            if (instance == null) {
                instance = AppLogger(debugMode)
            }
            return instance!!
        }

        fun getInstance(): AppLogger {
            return instance!!
        }
    }
}