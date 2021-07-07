package com.chaithanya.bookmyshow.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CastModel(
    val castImage:String? = null,
    val castName:String? = null
):Parcelable