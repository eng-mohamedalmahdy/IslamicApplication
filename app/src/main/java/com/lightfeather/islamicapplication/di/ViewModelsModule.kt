package com.lightfeather.islamicapplication.di

import com.lightfeather.islamicapplication.quran.view.QuranPagesFragment
import com.lightfeather.islamicapplication.quran.view.QuranPagesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelsModule = module {

    viewModel { QuranPagesViewModel() }
}