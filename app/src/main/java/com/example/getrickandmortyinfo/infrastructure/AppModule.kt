package com.example.getrickandmortyinfo.infrastructure

import com.example.getrickandmortyinfo.data.ApiClient
import com.example.getrickandmortyinfo.data.CharacterRepository
import com.example.getrickandmortyinfo.domain.CharacterInteractor
import com.example.getrickandmortyinfo.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val module = module {
    single { ApiClient() }
    single { CharacterRepository(get()) }
    single { CharacterInteractor(get())}
    viewModel { MainViewModel(get()) }
}