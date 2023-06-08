package com.architecture.appstartup

class AppData {
    private var numberOfApps: Int = 0
    private var type: String? = null

    /***
     * If AppLogger is not initialize, it will crashed
     */
    fun printValue() {
        AppLogger.getInstance().logD("numberOfApps=$numberOfApps\ntype=$type")
    }

    companion object {
        public lateinit var appData: AppData

        fun initData(): AppData {
            appData = AppData()
            appData.numberOfApps = 10
            appData.type = "Initializer"
            return appData
        }
    }
}