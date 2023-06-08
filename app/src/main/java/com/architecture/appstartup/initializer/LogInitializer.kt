package com.architecture.appstartup.initializer

import android.content.Context
import androidx.startup.Initializer
import com.architecture.appstartup.BuildConfig
import com.architecture.appstartup.AppLogger

class LogInitializer : Initializer<AppLogger> {
    override fun create(context: Context): AppLogger {
        return AppLogger.init(BuildConfig.DEBUG)
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }

}