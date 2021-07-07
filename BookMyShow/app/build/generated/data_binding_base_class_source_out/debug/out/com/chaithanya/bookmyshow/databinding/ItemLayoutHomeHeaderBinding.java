// Generated by view binder compiler. Do not edit!
package com.chaithanya.bookmyshow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.chaithanya.bookmyshow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemLayoutHomeHeaderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView headerRecyclerImage;

  private ItemLayoutHomeHeaderBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView headerRecyclerImage) {
    this.rootView = rootView;
    this.headerRecyclerImage = headerRecyclerImage;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLayoutHomeHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLayoutHomeHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_layout_home_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLayoutHomeHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.headerRecyclerImage;
      ImageView headerRecyclerImage = rootView.findViewById(id);
      if (headerRecyclerImage == null) {
        break missingId;
      }

      return new ItemLayoutHomeHeaderBinding((LinearLayout) rootView, headerRecyclerImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}