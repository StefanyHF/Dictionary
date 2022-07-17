package com.android.course.dictionaryhf.feature_dictionary.domain.repository

import com.android.course.dictionaryhf.core.util.Resource
import com.android.course.dictionaryhf.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow


interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}