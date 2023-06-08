package com.architecture.appstartup

import android.app.Application
import android.util.Log

class MainApp : Application() {
    private val TAG = "MainApp"

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "onCreate");
    }
}