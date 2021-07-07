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

public data class EventDetailsFragmentFromHomeArgs(
  public val events: HomeEventsChildModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(HomeEventsChildModel::class.java)) {
      result.putParcelable("events", this.events as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(HomeEventsChildModel::class.java)) {
      result.putSerializable("events", this.events as Serializable)
    } else {
      throw UnsupportedOperationException(HomeEventsChildModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): EventDetailsFragmentFromHomeArgs {
      bundle.setClassLoader(EventDetailsFragmentFromHomeArgs::class.java.classLoader)
      val __events : HomeEventsChildModel?
      if (bundle.containsKey("events")) {
        if (Parcelable::class.java.isAssignableFrom(HomeEventsChildModel::class.java) ||
            Serializable::class.java.isAssignableFrom(HomeEventsChildModel::class.java)) {
          __events = bundle.get("events") as HomeEventsChildModel?
        } else {
          throw UnsupportedOperationException(HomeEventsChildModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__events == null) {
          throw IllegalArgumentException("Argument \"events\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"events\" is missing and does not have an android:defaultValue")
      }
      return EventDetailsFragmentFromHomeArgs(__events)
    }
  }
}
