package com.chaithanya.bookmyshow.ui.activity

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class YoutubePlayerActivityArgs(
  public val youtubelink: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("youtubelink", this.youtubelink)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): YoutubePlayerActivityArgs {
      bundle.setClassLoader(YoutubePlayerActivityArgs::class.java.classLoader)
      val __youtubelink : String?
      if (bundle.containsKey("youtubelink")) {
        __youtubelink = bundle.getString("youtubelink")
        if (__youtubelink == null) {
          throw IllegalArgumentException("Argument \"youtubelink\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"youtubelink\" is missing and does not have an android:defaultValue")
      }
      return YoutubePlayerActivityArgs(__youtubelink)
    }
  }
}
