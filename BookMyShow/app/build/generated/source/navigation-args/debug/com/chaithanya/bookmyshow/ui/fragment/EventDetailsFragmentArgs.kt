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
  public val eventmodel: HomeEventsChildModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(HomeEventsChildModel::class.java)) {
      result.putParcelable("eventmodel", this.eventmodel as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(HomeEventsChildModel::class.java)) {
      result.putSerializable("eventmodel", this.eventmodel as Serializable)
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
      val __eventmodel : HomeEventsChildModel?
      if (bundle.containsKey("eventmodel")) {
        if (Parcelable::class.java.isAssignableFrom(HomeEventsChildModel::class.java) ||
            Serializable::class.java.isAssignableFrom(HomeEventsChildModel::class.java)) {
          __eventmodel = bundle.get("eventmodel") as HomeEventsChildModel?
        } else {
          throw UnsupportedOperationException(HomeEventsChildModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__eventmodel == null) {
          throw IllegalArgumentException("Argument \"eventmodel\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"eventmodel\" is missing and does not have an android:defaultValue")
      }
      return EventDetailsFragmentArgs(__eventmodel)
    }
  }
}
