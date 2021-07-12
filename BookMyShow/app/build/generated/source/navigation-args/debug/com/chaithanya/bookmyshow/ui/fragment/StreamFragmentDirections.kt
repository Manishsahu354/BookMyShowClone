package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.`data`.model.HomeStreamModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class StreamFragmentDirections private constructor() {
  private data class ActionStreamFragmentToStreamMovieFragment2(
    public val stream: HomeStreamModel
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_streamFragment_to_streamMovieFragment2

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(HomeStreamModel::class.java)) {
        result.putParcelable("stream", this.stream as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(HomeStreamModel::class.java)) {
        result.putSerializable("stream", this.stream as Serializable)
      } else {
        throw UnsupportedOperationException(HomeStreamModel::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionStreamFragmentToStreamMovieFragment2(stream: HomeStreamModel): NavDirections =
        ActionStreamFragmentToStreamMovieFragment2(stream)
  }
}
