package com.lightfeather.islamicapplication.quran.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lightfeather.domain.usecase.quran.GetAllQuranPagesUseCase
import com.lightfeather.islamicapplication.quran.model.UiQuranPage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class QuranPagesViewModel(private val getQuranPagesUseCase: GetAllQuranPagesUseCase) : ViewModel() {

    private val _quranPages = MutableStateFlow<List<UiQuranPage>>(listOf())
    val quranPages = _quranPages.asStateFlow()

    init {
        viewModelScope.launch {
            _quranPages.update {
                getQuranPagesUseCase().map { UiQuranPage(null, it, listOf()) }
            }
        }
    }
}