package com.example.newsmvvm.pojo

data class Article(
    val author: String? = null,
    val content: String = "",
    val description: String? = null,
    val publishedAt: String = "",
    val source: Source = Source(),
    val title: String = "",
    val url: String = "",
    val urlToImage: String? = null
)