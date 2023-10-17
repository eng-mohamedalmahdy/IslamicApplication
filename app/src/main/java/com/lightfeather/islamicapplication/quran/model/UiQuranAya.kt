package com.lightfeather.islamicapplication.quran.model

data class UiQuranAya(
    val id: Int,
    val number: Int,
    val soraNumber: Int,
    val jozzNumber: Int,
    val content: String,
    val contentWithTashkeel: String,
)
