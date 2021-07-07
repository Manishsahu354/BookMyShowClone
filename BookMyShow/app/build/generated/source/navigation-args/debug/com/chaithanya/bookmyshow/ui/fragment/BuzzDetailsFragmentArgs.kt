package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class BuzzDetailsFragmentArgs(
  public val buzzWebUrl: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("buzzWebUrl", this.buzzWebUrl)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): BuzzDetailsFragmentArgs {
      bundle.setClassLoader(BuzzDetailsFragmentArgs::class.java.classLoader)
      val __buzzWebUrl : String?
      if (bundle.containsKey("buzzWebUrl")) {
        __buzzWebUrl = bundle.getString("buzzWebUrl")
        if (__buzzWebUrl == null) {
          throw IllegalArgumentException("Argument \"buzzWebUrl\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"buzzWebUrl\" is missing and does not have an android:defaultValue")
      }
      return BuzzDetailsFragmentArgs(__buzzWebUrl)
    }
  }
}
