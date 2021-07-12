package com.chaithanya.bookmyshow.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue


@Parcelize
data class HomeStreamModel(
    val about:String? = null,
    val age:String? = null,
    val cast: @RawValue MutableList<CastModel>? = mutableListOf(),
    val categoryName:String? = null,
    val crew: @RawValue MutableList<CrewModel>? = mutableListOf(),
    val date:String? = null,
    val language:String? = null,
    val mainImage:String? = null,
    val price:String? = null,
    val thumbImage:String? = null,
    val time:String? = null,
    val title:String? = null,
    val trailerUrl:String? = null
):Parcelable