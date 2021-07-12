package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.`data`.model.HomeEventsChildModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class EventsFragmentDirections private constructor() {
  private data class ActionEventsFragment2ToEventDetailsFragment2(
    public val eventModel: HomeEventsChildModel
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_eventsFragment2_to_eventDetailsFragment2

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionEventsFragment2ToEventDetailsFragment2(eventModel: HomeEventsChildModel):
        NavDirections = ActionEventsFragment2ToEventDetailsFragment2(eventModel)
  }
}
