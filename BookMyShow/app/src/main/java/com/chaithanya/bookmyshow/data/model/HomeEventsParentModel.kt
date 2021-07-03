package com.chaithanya.bookmyshow.data.model

data class HomeEventsParentModel(
    val eventsName:String?="",
    val childList :MutableList<HomeEventsChildModel>? = null
) {

}