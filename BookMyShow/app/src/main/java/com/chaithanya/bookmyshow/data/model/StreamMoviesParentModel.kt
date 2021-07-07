package com.chaithanya.bookmyshow.data.model

data class StreamMoviesParentModel(
    val movieType:String? = null,
    val streamMoviesChildList :MutableList<HomeStreamModel>? = null
) {
}