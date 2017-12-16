package com.melnykov.notes

import android.app.Application
import com.facebook.stetho.Stetho

class NotesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initStetho()
    }

    private fun initStetho() {
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
    }
}