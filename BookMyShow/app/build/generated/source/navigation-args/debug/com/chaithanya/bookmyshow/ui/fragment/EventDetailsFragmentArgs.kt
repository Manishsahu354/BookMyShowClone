package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.chaithanya.bookmyshow.`data`.model.HomeEventsChildModel
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class EventDetailsFragmentArgs(
  public val eventModel: HomeEventsChildModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(HomeEventsChildModel::class.java)) {
      result.putParcelable("eventModel", this.eventModel as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(HomeEventsChildModel::class.java)) {
      result.putSerializable("eventModel", this.eventModel as Serializable)
    } else {
      throw UnsupportedOperationException(HomeEventsChildModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): EventDetailsFragmentArgs {
      bundle.setClassLoader(EventDetailsFragmentArgs::class.java.classLoader)
      val __eventModel : HomeEventsChildModel?
      if (bundle.containsKey("eventModel")) {
        if (Parcelable::class.java.isAssignableFrom(HomeEventsChildModel::class.java) ||
            Serializable::class.java.isAssignableFrom(HomeEventsChildModel::class.java)) {
          __eventModel = bundle.get("eventModel") as HomeEventsChildModel?
        } else {
          throw UnsupportedOperationException(HomeEventsChildModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__eventModel == null) {
          throw IllegalArgumentException("Argument \"eventModel\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"eventModel\" is missing and does not have an android:defaultValue")
      }
      return EventDetailsFragmentArgs(__eventModel)
    }
  }
}
