// Generated by view binder compiler. Do not edit!
package com.chaithanya.bookmyshow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.chaithanya.bookmyshow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemLayoutStreamMoviesParentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView streamMoviesChildRecycleView;

  @NonNull
  public final TextView tvMovieType;

  @NonNull
  public final TextView tvSeeAllStream;

  private ItemLayoutStreamMoviesParentBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView streamMoviesChildRecycleView, @NonNull TextView tvMovieType,
      @NonNull TextView tvSeeAllStream) {
    this.rootView = rootView;
    this.streamMoviesChildRecycleView = streamMoviesChildRecycleView;
    this.tvMovieType = tvMovieType;
    this.tvSeeAllStream = tvSeeAllStream;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLayoutStreamMoviesParentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLayoutStreamMoviesParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_layout_stream_movies_parent, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLayoutStreamMoviesParentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.streamMoviesChildRecycleView;
      RecyclerView streamMoviesChildRecycleView = rootView.findViewById(id);
      if (streamMoviesChildRecycleView == null) {
        break missingId;
      }

      id = R.id.tvMovieType;
      TextView tvMovieType = rootView.findViewById(id);
      if (tvMovieType == null) {
        break missingId;
      }

      id = R.id.tvSeeAllStream;
      TextView tvSeeAllStream = rootView.findViewById(id);
      if (tvSeeAllStream == null) {
        break missingId;
      }

      return new ItemLayoutStreamMoviesParentBinding((ConstraintLayout) rootView,
          streamMoviesChildRecycleView, tvMovieType, tvSeeAllStream);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}