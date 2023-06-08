package com.architecture.appstartup.initializer

import android.content.Context
import androidx.startup.Initializer
import com.architecture.appstartup.AppData

class AppDataInitializer : Initializer<AppData> {
    override fun create(context: Context): AppData {
        return AppData.initData()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return listOf(LogInitializer::class.java)
    }

}