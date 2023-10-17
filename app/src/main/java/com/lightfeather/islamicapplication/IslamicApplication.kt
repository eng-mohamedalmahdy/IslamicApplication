package com.lightfeather.islamicapplication

import android.app.Application
import com.lightfeather.islamicapplication.di.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class IslamicApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            // Log Koin into Android logger
            androidLogger()
            // Reference Android context
            androidContext(this@IslamicApplication)
            // Load modules
            modules(viewModelsModule)
        }
    }
}