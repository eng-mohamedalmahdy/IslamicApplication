package com.lightfeather.domain.repository

import com.lightfeather.domain.entity.AyaTafseer
import com.lightfeather.domain.entity.QuranAya
import java.io.InputStream

interface QuranRepository {
    suspend fun getQuranPage(pageNumber: Int): List<QuranAya>

    suspend fun searchQuran(searchKey: String): List<QuranAya>

    suspend fun startOrResumeKhatma(): Int

    suspend fun getAyaTafseer(aya: QuranAya): AyaTafseer

    suspend fun getAllQuranPages(): List<InputStream>


}