package com.chaithanya.bookmyshow.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class HomeEventsChildModel(
    val imageUrl:String? = null,
    var title:String? = null,
    val time:String? = null,
    val about:String? = null,
    val date:String? = null,
    val free:String? = null,
    val interested:String? = null,
    val language:String? = null,
    val price:String? = null,
    val venue:String? = null,
    val categoryName:String? = null,
    val fullImage:String? = null,
    val Artist: @RawValue MutableList<ArtistModel>? = mutableListOf()
):Parcelable