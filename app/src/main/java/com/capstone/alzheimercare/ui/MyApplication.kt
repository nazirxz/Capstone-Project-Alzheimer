package com.capstone.alzheimercare.ui

import android.app.Application
import com.capstone.alzheimercare.core.network.di.databaseModule
import com.capstone.alzheimercare.core.network.di.networkModule
import com.capstone.alzheimercare.core.network.di.repositoryModule
import com.capstone.alzheimercare.di.useCaseModule
import com.capstone.alzheimercare.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}