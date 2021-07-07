// Generated by view binder compiler. Do not edit!
package com.chaithanya.bookmyshow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.chaithanya.bookmyshow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBuzzBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView bgStreamHeader;

  @NonNull
  public final RecyclerView buzzRecyclerview;

  @NonNull
  public final TextView imageStreamLogo;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final RecyclerView statusRecyclerview;

  @NonNull
  public final TextView tvLocation;

  private FragmentBuzzBinding(@NonNull ConstraintLayout rootView, @NonNull TextView bgStreamHeader,
      @NonNull RecyclerView buzzRecyclerview, @NonNull TextView imageStreamLogo,
      @NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView statusRecyclerview,
      @NonNull TextView tvLocation) {
    this.rootView = rootView;
    this.bgStreamHeader = bgStreamHeader;
    this.buzzRecyclerview = buzzRecyclerview;
    this.imageStreamLogo = imageStreamLogo;
    this.nestedScrollView = nestedScrollView;
    this.statusRecyclerview = statusRecyclerview;
    this.tvLocation = tvLocation;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBuzzBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBuzzBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_buzz, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBuzzBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bgStreamHeader;
      TextView bgStreamHeader = rootView.findViewById(id);
      if (bgStreamHeader == null) {
        break missingId;
      }

      id = R.id.buzzRecyclerview;
      RecyclerView buzzRecyclerview = rootView.findViewById(id);
      if (buzzRecyclerview == null) {
        break missingId;
      }

      id = R.id.imageStreamLogo;
      TextView imageStreamLogo = rootView.findViewById(id);
      if (imageStreamLogo == null) {
        break missingId;
      }

      id = R.id.nestedScrollView;
      NestedScrollView nestedScrollView = rootView.findViewById(id);
      if (nestedScrollView == null) {
        break missingId;
      }

      id = R.id.statusRecyclerview;
      RecyclerView statusRecyclerview = rootView.findViewById(id);
      if (statusRecyclerview == null) {
        break missingId;
      }

      id = R.id.tvLocation;
      TextView tvLocation = rootView.findViewById(id);
      if (tvLocation == null) {
        break missingId;
      }

      return new FragmentBuzzBinding((ConstraintLayout) rootView, bgStreamHeader, buzzRecyclerview,
          imageStreamLogo, nestedScrollView, statusRecyclerview, tvLocation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}