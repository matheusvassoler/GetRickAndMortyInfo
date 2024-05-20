package com.example.getrickandmortyinfo.data.entity

import com.google.gson.annotations.SerializedName

data class SeriesCharacter(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val characterStatus: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("origin")
    val characterOrigin: CharacterOrigin
)