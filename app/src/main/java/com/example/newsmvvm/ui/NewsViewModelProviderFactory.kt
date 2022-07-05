package com.example.newsmvvm.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newsmvvm.repository.NewsRepository

/**
 * @author Mingaleev D. 05.07.2022
 **/
class NewsViewModelProviderFactory(
    val newsRepository: NewsRepository
) :ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}