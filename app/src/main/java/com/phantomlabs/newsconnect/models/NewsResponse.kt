package com.phantomlabs.newsconnect.models

import com.phantomlabs.newsconnect.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)