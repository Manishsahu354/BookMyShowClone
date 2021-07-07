package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.chaithanya.bookmyshow.R
import kotlin.Int
import kotlin.String

public class BuzzFragmentDirections private constructor() {
  private data class ActionBuzzFragmentToBuzzDetailsFragment(
    public val buzzWebUrl: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_buzzFragment_to_buzzDetailsFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("buzzWebUrl", this.buzzWebUrl)
      return result
    }
  }

  public companion object {
    public fun actionBuzzFragmentToBuzzDetailsFragment(buzzWebUrl: String): NavDirections =
        ActionBuzzFragmentToBuzzDetailsFragment(buzzWebUrl)
  }
}
