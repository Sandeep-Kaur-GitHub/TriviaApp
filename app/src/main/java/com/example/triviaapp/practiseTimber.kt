package com.example.triviaapp

import android.app.Application
import timber.log.Timber

class practiseTimber: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}