package com.lightfeather.islamicapplication.quran.model

import java.io.InputStream

data class UiQuranPage(val pageNumber: String?,val pageImage:InputStream,val ayaList: List<UiQuranAya>,)
