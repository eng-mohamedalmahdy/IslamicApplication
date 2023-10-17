package com.lightfeather.domain.entity

data class QuranAya(
    val id: Int,
    val number: Int,
    val soraNumber: Int,
    val jozzNumber: Int,
    val content: String,
    val contentWithTashkeel: String,
)
