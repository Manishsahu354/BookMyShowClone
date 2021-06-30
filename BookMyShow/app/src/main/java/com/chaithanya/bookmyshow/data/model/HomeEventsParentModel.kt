package com.chaithanya.bookmyshow.data.model

data class HomeEventsParentModel(
    val eventsName:String,
    val homeEventsChildList :MutableList<HomeEventsChildModel>
) {
}