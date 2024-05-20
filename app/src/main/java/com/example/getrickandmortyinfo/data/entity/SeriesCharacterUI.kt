package com.example.getrickandmortyinfo.data.entity

import com.google.gson.annotations.SerializedName

data class SeriesCharacterUI(
    val id: Int,
    val name: String,
    val characterStatus: String,
    val species: String,
    val gender: String,
    val characterOrigin: String
)