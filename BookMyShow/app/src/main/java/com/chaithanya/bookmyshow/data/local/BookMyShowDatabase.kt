package com.chaithanya.bookmyshow.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [BookedEventEntity::class],version = 1,exportSchema = false)
abstract class BookMyShowDatabase:RoomDatabase() {

    abstract fun bookedEventDao():BookedEventDAO

}