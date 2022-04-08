package com.phantomlabs.newsconnect.repository

import com.phantomlabs.newsconnect.api.RetrofitInstance
import com.phantomlabs.newsconnect.db.ArticleDatabase

class NewsRepository(
    val db : ArticleDatabase,
) {
    suspend fun getBreakingNews(countryCode : String, pageNumber : Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

}