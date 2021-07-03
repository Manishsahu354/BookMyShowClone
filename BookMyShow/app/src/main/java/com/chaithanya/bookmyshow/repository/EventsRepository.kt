package com.chaithanya.bookmyshow.repository

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class EventsRepository {

    private val database = FirebaseDatabase.getInstance()
    private val eventData = database.getReference("homeNested")
}