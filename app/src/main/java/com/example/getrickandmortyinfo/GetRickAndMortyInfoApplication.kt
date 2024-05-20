package com.example.getrickandmortyinfo

import android.app.Application
import com.example.getrickandmortyinfo.infrastructure.module
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication

class GetRickAndMortyInfoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@GetRickAndMortyInfoApplication)
            modules(listOf(module))
        }
    }
}