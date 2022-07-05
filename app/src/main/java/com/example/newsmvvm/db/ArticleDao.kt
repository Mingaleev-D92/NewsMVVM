package com.example.newsmvvm.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.newsmvvm.pojo.Article

/**
 * @author Mingaleev D. 05.07.2022
 **/

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article):Long

    @Query("SELECT * FROM articles")
    fun getAllArticles():LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}