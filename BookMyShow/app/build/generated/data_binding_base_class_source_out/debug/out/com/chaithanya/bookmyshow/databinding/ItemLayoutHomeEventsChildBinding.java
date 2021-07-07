// Generated by view binder compiler. Do not edit!
package com.chaithanya.bookmyshow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.chaithanya.bookmyshow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemLayoutHomeEventsChildBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ConstraintLayout homeEventsChildConstraint;

  @NonNull
  public final ImageView ivEventItem;

  @NonNull
  public final TextView tvCategory;

  @NonNull
  public final TextView tvContentTitle;

  private ItemLayoutHomeEventsChildBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardView, @NonNull ConstraintLayout homeEventsChildConstraint,
      @NonNull ImageView ivEventItem, @NonNull TextView tvCategory,
      @NonNull TextView tvContentTitle) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.homeEventsChildConstraint = homeEventsChildConstraint;
    this.ivEventItem = ivEventItem;
    this.tvCategory = tvCategory;
    this.tvContentTitle = tvContentTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLayoutHomeEventsChildBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLayoutHomeEventsChildBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_layout_home_events_child, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLayoutHomeEventsChildBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = rootView.findViewById(id);
      if (cardView == null) {
        break missingId;
      }

      ConstraintLayout homeEventsChildConstraint = (ConstraintLayout) rootView;

      id = R.id.ivEventItem;
      ImageView ivEventItem = rootView.findViewById(id);
      if (ivEventItem == null) {
        break missingId;
      }

      id = R.id.tvCategory;
      TextView tvCategory = rootView.findViewById(id);
      if (tvCategory == null) {
        break missingId;
      }

      id = R.id.tvContentTitle;
      TextView tvContentTitle = rootView.findViewById(id);
      if (tvContentTitle == null) {
        break missingId;
      }

      return new ItemLayoutHomeEventsChildBinding((ConstraintLayout) rootView, cardView,
          homeEventsChildConstraint, ivEventItem, tvCategory, tvContentTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}