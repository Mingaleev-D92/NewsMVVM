package com.example.newsmvvm.pojo

data class NewsResponse(
    val articles: List<Article> = listOf(),
    val status: String = "",
    val totalResults: Int = 0
)