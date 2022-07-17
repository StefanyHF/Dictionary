package com.android.course.dictionaryhf.feature_dictionary.domain.model

import com.android.course.dictionaryhf.feature_dictionary.data.remote.dto.MeaningDto
import com.android.course.dictionaryhf.feature_dictionary.data.remote.dto.PhoneticDto

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String,
    val sourceUrls: List<String>,
    val word: String
)
