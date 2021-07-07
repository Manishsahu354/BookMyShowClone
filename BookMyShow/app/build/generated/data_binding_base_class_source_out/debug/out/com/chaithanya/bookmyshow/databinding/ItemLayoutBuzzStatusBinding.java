// Generated by view binder compiler. Do not edit!
package com.chaithanya.bookmyshow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.chaithanya.bookmyshow.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemLayoutBuzzStatusBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CircleImageView buzzStatusRoundImage;

  @NonNull
  public final TextView buzzStatusTitle;

  private ItemLayoutBuzzStatusBinding(@NonNull LinearLayout rootView,
      @NonNull CircleImageView buzzStatusRoundImage, @NonNull TextView buzzStatusTitle) {
    this.rootView = rootView;
    this.buzzStatusRoundImage = buzzStatusRoundImage;
    this.buzzStatusTitle = buzzStatusTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLayoutBuzzStatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLayoutBuzzStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_layout_buzz_status, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLayoutBuzzStatusBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buzzStatusRoundImage;
      CircleImageView buzzStatusRoundImage = rootView.findViewById(id);
      if (buzzStatusRoundImage == null) {
        break missingId;
      }

      id = R.id.buzzStatusTitle;
      TextView buzzStatusTitle = rootView.findViewById(id);
      if (buzzStatusTitle == null) {
        break missingId;
      }

      return new ItemLayoutBuzzStatusBinding((LinearLayout) rootView, buzzStatusRoundImage,
          buzzStatusTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
