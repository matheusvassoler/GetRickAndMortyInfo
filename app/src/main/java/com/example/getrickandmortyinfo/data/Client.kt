package com.example.getrickandmortyinfo.data

import com.example.getrickandmortyinfo.data.entity.SeriesCharacter
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Client {

    @GET("character/{character_id}")
    suspend fun getSeriesCharacterById(
        @Path(value = "character_id") characterId: Int
    ): Response<SeriesCharacter>
}