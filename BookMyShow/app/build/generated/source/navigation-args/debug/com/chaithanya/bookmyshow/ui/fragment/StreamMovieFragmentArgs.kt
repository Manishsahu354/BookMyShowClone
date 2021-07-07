package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.chaithanya.bookmyshow.`data`.model.HomeStreamModel
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class StreamMovieFragmentArgs(
  public val stream: HomeStreamModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): StreamMovieFragmentArgs {
      bundle.setClassLoader(StreamMovieFragmentArgs::class.java.classLoader)
      val __stream : HomeStreamModel?
      if (bundle.containsKey("stream")) {
        if (Parcelable::class.java.isAssignableFrom(HomeStreamModel::class.java) ||
            Serializable::class.java.isAssignableFrom(HomeStreamModel::class.java)) {
          __stream = bundle.get("stream") as HomeStreamModel?
        } else {
          throw UnsupportedOperationException(HomeStreamModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__stream == null) {
          throw IllegalArgumentException("Argument \"stream\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"stream\" is missing and does not have an android:defaultValue")
      }
      return StreamMovieFragmentArgs(__stream)
    }
  }
}
