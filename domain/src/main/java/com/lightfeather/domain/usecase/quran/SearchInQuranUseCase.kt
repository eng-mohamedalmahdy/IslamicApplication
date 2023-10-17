package com.lightfeather.domain.usecase.quran

import com.lightfeather.domain.repository.QuranRepository


class SearchInQuranUseCase(private val repository : QuranRepository){
   suspend operator fun invoke(searchKey:String) = repository.searchQuran(searchKey)
}