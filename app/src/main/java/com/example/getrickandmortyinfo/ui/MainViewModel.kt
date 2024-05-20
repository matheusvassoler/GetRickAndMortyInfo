package com.example.getrickandmortyinfo.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.getrickandmortyinfo.domain.CharacterInteractor
import kotlinx.coroutines.launch

class MainViewModel(
    private val characterInteractor: CharacterInteractor
) : ViewModel() {

    fun getCharacterById() {
        viewModelScope.launch {
            // TODO - Recuperar informações do personagem com id 1 através do characterInteractor
            // TODO - Repassar as informações do personagem para a activity através de live data
        }
    }
}