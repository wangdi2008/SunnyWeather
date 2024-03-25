package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object {
        const val TOKEN = "IkavrexGsFwx9IYC"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}