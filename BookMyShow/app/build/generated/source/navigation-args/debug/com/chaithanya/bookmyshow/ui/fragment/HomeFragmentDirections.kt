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
  private data class ActionHomeFragmentToEventDetailsFragmentFromHome(
    public val events: HomeEventsChildModel
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_homeFragment_to_eventDetailsFragmentFromHome

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionHomeFragmentToStreamActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_streamActivity)

    public fun actionHomeFragmentToEventsActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_eventsActivity)

    public fun actionHomeFragmentToEventDetailsFragmentFromHome(events: HomeEventsChildModel):
        NavDirections = ActionHomeFragmentToEventDetailsFragmentFromHome(events)
  }
}
