package com.chaithanya.bookmyshow.data.model

data class BuzzArticlesModel(
    val imageUrl:String,
    val articleTitle:String,
    val category:String,
    val writer:String,
    val profileImageUrl:String,
    val likeCount:String,
    val time:String,
    val liked:Boolean,
    val date:String,
    val readingTime:String
) {
}