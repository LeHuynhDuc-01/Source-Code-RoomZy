// Generated by view binder compiler. Do not edit!
package com.app.roomzy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.roomzy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutItemBookingHistoryBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView checkInDate;

  @NonNull
  public final TextView checkOutDate;

  @NonNull
  public final ImageView roomImage;

  @NonNull
  public final TextView roomName;

  @NonNull
  public final TextView roomPrice;

  @NonNull
  public final TextView roomStatus;

  private LayoutItemBookingHistoryBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView checkInDate, @NonNull TextView checkOutDate, @NonNull ImageView roomImage,
      @NonNull TextView roomName, @NonNull TextView roomPrice, @NonNull TextView roomStatus) {
    this.rootView = rootView;
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;
    this.roomImage = roomImage;
    this.roomName = roomName;
    this.roomPrice = roomPrice;
    this.roomStatus = roomStatus;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutItemBookingHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutItemBookingHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_item_booking_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutItemBookingHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checkInDate;
      TextView checkInDate = ViewBindings.findChildViewById(rootView, id);
      if (checkInDate == null) {
        break missingId;
      }

      id = R.id.checkOutDate;
      TextView checkOutDate = ViewBindings.findChildViewById(rootView, id);
      if (checkOutDate == null) {
        break missingId;
      }

      id = R.id.roomImage;
      ImageView roomImage = ViewBindings.findChildViewById(rootView, id);
      if (roomImage == null) {
        break missingId;
      }

      id = R.id.roomName;
      TextView roomName = ViewBindings.findChildViewById(rootView, id);
      if (roomName == null) {
        break missingId;
      }

      id = R.id.roomPrice;
      TextView roomPrice = ViewBindings.findChildViewById(rootView, id);
      if (roomPrice == null) {
        break missingId;
      }

      id = R.id.roomStatus;
      TextView roomStatus = ViewBindings.findChildViewById(rootView, id);
      if (roomStatus == null) {
        break missingId;
      }

      return new LayoutItemBookingHistoryBinding((RelativeLayout) rootView, checkInDate,
          checkOutDate, roomImage, roomName, roomPrice, roomStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
