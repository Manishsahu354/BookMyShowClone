package com.chaithanya.bookmyshow.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CrewModel(
    val crewImage:String? = null,
    val crewName:String? = null
):Parcelable