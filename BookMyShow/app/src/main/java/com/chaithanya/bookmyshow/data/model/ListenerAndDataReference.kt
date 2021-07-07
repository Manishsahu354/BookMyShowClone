package com.chaithanya.bookmyshow.data.model

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener

data class ListenerAndDataReference(
    val database: DatabaseReference,
    val listener: ValueEventListener
) {
}