package com.chaithanya.bookmyshow.data.model

data class StreamMoviesParentModel(
    val movieType:String,
    val streamMoviesChildList :MutableList<HomeStreamModel>
) {
}