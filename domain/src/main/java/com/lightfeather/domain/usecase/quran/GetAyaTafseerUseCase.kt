package com.lightfeather.domain.usecase.quran

import com.lightfeather.domain.entity.QuranAya
import com.lightfeather.domain.repository.QuranRepository

class GetAyaTafseerUseCase(private val repository: QuranRepository) {

    suspend operator fun invoke(aya: QuranAya) = repository.getAyaTafseer(aya)

}
