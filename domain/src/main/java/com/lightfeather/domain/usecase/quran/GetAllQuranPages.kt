package com.lightfeather.domain.usecase.quran

import com.lightfeather.domain.repository.QuranRepository

class GetAllQuranPagesUseCase(private val repository: QuranRepository) {

    suspend operator fun invoke() = repository.getAllQuranPages()

}
