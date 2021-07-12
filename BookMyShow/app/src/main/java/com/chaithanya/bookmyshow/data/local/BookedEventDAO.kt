package com.chaithanya.bookmyshow.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.chaithanya.bookmyshow.data.model.HomeEventsChildModel

@Dao
interface BookedEventDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBookedEvent(event: BookedEventEntity)

    @Query("SELECT * FROM BookedEvent ORDER BY id DESC")
    fun getAllBookedEvent(): LiveData<MutableList<BookedEventEntity>>
}