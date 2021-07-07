package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.chaithanya.bookmyshow.R
import kotlin.Int
import kotlin.String

public class StreamMovieFragmentDirections private constructor() {
  private data class ActionStreamMovieFragmentToYoutubePlayerActivity(
    public val youtubelink: String
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_streamMovieFragment_to_youtubePlayerActivity

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("youtubelink", this.youtubelink)
      return result
    }
  }

  public companion object {
    public fun actionStreamMovieFragmentToYoutubePlayerActivity(youtubelink: String): NavDirections
        = ActionStreamMovieFragmentToYoutubePlayerActivity(youtubelink)
  }
}
