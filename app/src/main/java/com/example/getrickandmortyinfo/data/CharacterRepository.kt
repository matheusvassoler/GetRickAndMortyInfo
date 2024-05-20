package com.example.getrickandmortyinfo.data

class CharacterRepository(private val apiClient: ApiClient) {

    suspend fun getCharacterById(characterId: Int) = apiClient().getSeriesCharacterById(characterId)
}