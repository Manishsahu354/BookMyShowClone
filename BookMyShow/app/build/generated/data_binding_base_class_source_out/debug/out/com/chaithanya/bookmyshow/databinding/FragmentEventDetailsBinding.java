// Generated by view binder compiler. Do not edit!
package com.chaithanya.bookmyshow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.chaithanya.bookmyshow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEventDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView bgEventsHeader;

  @NonNull
  public final CardView bottomCard;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final TextView eventPrice;

  @NonNull
  public final TextView eventsCategory;

  @NonNull
  public final TextView eventsDate;

  @NonNull
  public final TextView eventsTitle;

  @NonNull
  public final TextView eventsVenue;

  @NonNull
  public final TextView headerStreamTitle;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final ImageView imageShare;

  @NonNull
  public final ImageView imageStream;

  @NonNull
  public final RecyclerView recyclerviewArtist;

  @NonNull
  public final TextView tvAbout;

  @NonNull
  public final TextView tvAboutContent;

  @NonNull
  public final TextView tvArtist;

  @NonNull
  public final TextView tvLanguage;

  @NonNull
  public final TextView tvOnlineStreaming;

  @NonNull
  public final TextView tvTime;

  private FragmentEventDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView bgEventsHeader, @NonNull CardView bottomCard, @NonNull Button btnRegister,
      @NonNull TextView eventPrice, @NonNull TextView eventsCategory, @NonNull TextView eventsDate,
      @NonNull TextView eventsTitle, @NonNull TextView eventsVenue,
      @NonNull TextView headerStreamTitle, @NonNull ImageView imageBack,
      @NonNull ImageView imageShare, @NonNull ImageView imageStream,
      @NonNull RecyclerView recyclerviewArtist, @NonNull TextView tvAbout,
      @NonNull TextView tvAboutContent, @NonNull TextView tvArtist, @NonNull TextView tvLanguage,
      @NonNull TextView tvOnlineStreaming, @NonNull TextView tvTime) {
    this.rootView = rootView;
    this.bgEventsHeader = bgEventsHeader;
    this.bottomCard = bottomCard;
    this.btnRegister = btnRegister;
    this.eventPrice = eventPrice;
    this.eventsCategory = eventsCategory;
    this.eventsDate = eventsDate;
    this.eventsTitle = eventsTitle;
    this.eventsVenue = eventsVenue;
    this.headerStreamTitle = headerStreamTitle;
    this.imageBack = imageBack;
    this.imageShare = imageShare;
    this.imageStream = imageStream;
    this.recyclerviewArtist = recyclerviewArtist;
    this.tvAbout = tvAbout;
    this.tvAboutContent = tvAboutContent;
    this.tvArtist = tvArtist;
    this.tvLanguage = tvLanguage;
    this.tvOnlineStreaming = tvOnlineStreaming;
    this.tvTime = tvTime;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEventDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEventDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_event_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEventDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bgEventsHeader;
      TextView bgEventsHeader = rootView.findViewById(id);
      if (bgEventsHeader == null) {
        break missingId;
      }

      id = R.id.bottomCard;
      CardView bottomCard = rootView.findViewById(id);
      if (bottomCard == null) {
        break missingId;
      }

      id = R.id.btnRegister;
      Button btnRegister = rootView.findViewById(id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.eventPrice;
      TextView eventPrice = rootView.findViewById(id);
      if (eventPrice == null) {
        break missingId;
      }

      id = R.id.eventsCategory;
      TextView eventsCategory = rootView.findViewById(id);
      if (eventsCategory == null) {
        break missingId;
      }

      id = R.id.eventsDate;
      TextView eventsDate = rootView.findViewById(id);
      if (eventsDate == null) {
        break missingId;
      }

      id = R.id.eventsTitle;
      TextView eventsTitle = rootView.findViewById(id);
      if (eventsTitle == null) {
        break missingId;
      }

      id = R.id.eventsVenue;
      TextView eventsVenue = rootView.findViewById(id);
      if (eventsVenue == null) {
        break missingId;
      }

      id = R.id.headerStreamTitle;
      TextView headerStreamTitle = rootView.findViewById(id);
      if (headerStreamTitle == null) {
        break missingId;
      }

      id = R.id.imageBack;
      ImageView imageBack = rootView.findViewById(id);
      if (imageBack == null) {
        break missingId;
      }

      id = R.id.imageShare;
      ImageView imageShare = rootView.findViewById(id);
      if (imageShare == null) {
        break missingId;
      }

      id = R.id.imageStream;
      ImageView imageStream = rootView.findViewById(id);
      if (imageStream == null) {
        break missingId;
      }

      id = R.id.recyclerviewArtist;
      RecyclerView recyclerviewArtist = rootView.findViewById(id);
      if (recyclerviewArtist == null) {
        break missingId;
      }

      id = R.id.tvAbout;
      TextView tvAbout = rootView.findViewById(id);
      if (tvAbout == null) {
        break missingId;
      }

      id = R.id.tvAboutContent;
      TextView tvAboutContent = rootView.findViewById(id);
      if (tvAboutContent == null) {
        break missingId;
      }

      id = R.id.tvArtist;
      TextView tvArtist = rootView.findViewById(id);
      if (tvArtist == null) {
        break missingId;
      }

      id = R.id.tvLanguage;
      TextView tvLanguage = rootView.findViewById(id);
      if (tvLanguage == null) {
        break missingId;
      }

      id = R.id.tvOnlineStreaming;
      TextView tvOnlineStreaming = rootView.findViewById(id);
      if (tvOnlineStreaming == null) {
        break missingId;
      }

      id = R.id.tvTime;
      TextView tvTime = rootView.findViewById(id);
      if (tvTime == null) {
        break missingId;
      }

      return new FragmentEventDetailsBinding((ConstraintLayout) rootView, bgEventsHeader,
          bottomCard, btnRegister, eventPrice, eventsCategory, eventsDate, eventsTitle, eventsVenue,
          headerStreamTitle, imageBack, imageShare, imageStream, recyclerviewArtist, tvAbout,
          tvAboutContent, tvArtist, tvLanguage, tvOnlineStreaming, tvTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
