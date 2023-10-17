package com.lightfeather.domain.usecase.quran

import com.lightfeather.domain.repository.QuranRepository

class ReadQuranPageUseCase(private val repository: QuranRepository) {

   suspend operator fun invoke(pageNumber: Int) = repository.getQuranPage(pageNumber)

}

