package com.chaithanya.bookmyshow

data class HomeEventsParentModel(
    val eventsName:String,
    val homeEventsChildList :MutableList<HomeEventsChildModel>
) {
}