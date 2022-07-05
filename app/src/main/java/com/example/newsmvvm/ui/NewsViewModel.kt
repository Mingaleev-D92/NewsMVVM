package com.example.newsmvvm.ui

import androidx.lifecycle.ViewModel
import com.example.newsmvvm.repository.NewsRepository

/**
 * @author Mingaleev D. 05.07.2022
 **/
class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel(){

}