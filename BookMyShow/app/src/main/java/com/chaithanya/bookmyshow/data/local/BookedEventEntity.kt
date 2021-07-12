package com.chaithanya.bookmyshow.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "BookedEvent")
class BookedEventEntity(
    @ColumnInfo(name = "title") var title:String,
    @ColumnInfo(name = "imageUrl") var imageUrl:String,
    @ColumnInfo(name = "date") var date:String,
    @ColumnInfo(name = "quantity") var quantity:String,
    @ColumnInfo(name = "price") var price:String,
    @ColumnInfo(name = "venue") var venue:String,
) {
    @PrimaryKey(autoGenerate = true)@ColumnInfo(name = "id") var id: Int? = null

}