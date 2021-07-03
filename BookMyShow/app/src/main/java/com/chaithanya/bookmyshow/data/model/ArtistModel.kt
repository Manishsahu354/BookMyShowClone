package com.chaithanya.bookmyshow.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ArtistModel(
    val artistName:String?=null,
    val imageUrl:String?=null
):Parcelable