package com.android.course.dictionaryhf.feature_dictionary.presentation

import com.android.course.dictionaryhf.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
