package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.chaithanya.bookmyshow.R
import kotlin.Int
import kotlin.String

public class StreamMovieFragmentDirections private constructor() {
  private data class ActionStreamMovieFragment2ToYoutubePlayerActivity2(
    public val youtubelink: String
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_streamMovieFragment2_to_youtubePlayerActivity2

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("youtubelink", this.youtubelink)
      return result
    }
  }

  public companion object {
    public fun actionStreamMovieFragment2ToYoutubePlayerActivity2(youtubelink: String):
        NavDirections = ActionStreamMovieFragment2ToYoutubePlayerActivity2(youtubelink)
  }
}
