package models

data class res_news(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)