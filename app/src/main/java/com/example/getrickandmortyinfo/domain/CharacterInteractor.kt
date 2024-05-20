package com.example.getrickandmortyinfo.domain

import com.example.getrickandmortyinfo.data.CharacterRepository
import com.example.getrickandmortyinfo.data.entity.SeriesCharacterUI

class CharacterInteractor(
    private val characterRepository: CharacterRepository
) {

    suspend fun getCharacterById(characterId: Int): SeriesCharacterUI {
        val characterResponse = characterRepository.getCharacterById(characterId)

        if (characterResponse.isSuccessful) {
            val character = characterResponse.body()
            return SeriesCharacterUI(
                id = character?.id ?: 0,
                name = character?.name ?: "",
                characterStatus = character?.characterStatus ?: "",
                species = character?.species ?: "",
                gender = character?.gender ?: "",
                characterOrigin = character?.characterOrigin?.name ?: ""
            )
        } else {
            throw Exception()
        }
    }
}