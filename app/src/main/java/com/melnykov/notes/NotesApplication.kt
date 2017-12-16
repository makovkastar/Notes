package com.melnykov.notes

import android.app.Application
import android.os.StrictMode
import com.facebook.stetho.Stetho

class NotesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        enableStrictMode()
        initStetho()
    }

    private fun enableStrictMode() {
        if (BuildConfig.DEBUG) {
            StrictMode.enableDefaults()
        }
    }

    private fun initStetho() {
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
    }
}