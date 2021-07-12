package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.`data`.model.HomeEventsChildModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToEventDetailsFragment2(
    public val eventModel: HomeEventsChildModel
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_homeFragment_to_eventDetailsFragment2

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
    public fun actionHomeFragmentToStreamFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_streamFragment)

    public fun actionHomeFragmentToEventDetailsFragment2(eventModel: HomeEventsChildModel):
        NavDirections = ActionHomeFragmentToEventDetailsFragment2(eventModel)

    public fun actionHomeFragmentToEventsFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_eventsFragment2)
  }
}
