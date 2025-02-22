// Generated by view binder compiler. Do not edit!
package com.app.roomzy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.roomzy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBookingBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ImageView bannerImage;

  @NonNull
  public final Button bookNowButton;

  @NonNull
  public final Button checkInDate;

  @NonNull
  public final Button checkOutDate;

  @NonNull
  public final Button contactButton;

  @NonNull
  public final TextView hotelName;

  @NonNull
  public final NestedScrollView nestedScroll;

  @NonNull
  public final TextView roomPrice;

  @NonNull
  public final Button selectVoucherButton;

  @NonNull
  public final TextView selectedVoucherTextView;

  @NonNull
  public final TextView txtCheckin;

  @NonNull
  public final TextView txtCheckout;

  @NonNull
  public final TextView txtGiamGia;

  @NonNull
  public final TextView txtSoNgay;

  @NonNull
  public final TextView txtTotalPayment;

  private ActivityBookingBinding(@NonNull CoordinatorLayout rootView,
      @NonNull ImageView bannerImage, @NonNull Button bookNowButton, @NonNull Button checkInDate,
      @NonNull Button checkOutDate, @NonNull Button contactButton, @NonNull TextView hotelName,
      @NonNull NestedScrollView nestedScroll, @NonNull TextView roomPrice,
      @NonNull Button selectVoucherButton, @NonNull TextView selectedVoucherTextView,
      @NonNull TextView txtCheckin, @NonNull TextView txtCheckout, @NonNull TextView txtGiamGia,
      @NonNull TextView txtSoNgay, @NonNull TextView txtTotalPayment) {
    this.rootView = rootView;
    this.bannerImage = bannerImage;
    this.bookNowButton = bookNowButton;
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;
    this.contactButton = contactButton;
    this.hotelName = hotelName;
    this.nestedScroll = nestedScroll;
    this.roomPrice = roomPrice;
    this.selectVoucherButton = selectVoucherButton;
    this.selectedVoucherTextView = selectedVoucherTextView;
    this.txtCheckin = txtCheckin;
    this.txtCheckout = txtCheckout;
    this.txtGiamGia = txtGiamGia;
    this.txtSoNgay = txtSoNgay;
    this.txtTotalPayment = txtTotalPayment;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBookingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBookingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_booking, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBookingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bannerImage;
      ImageView bannerImage = ViewBindings.findChildViewById(rootView, id);
      if (bannerImage == null) {
        break missingId;
      }

      id = R.id.bookNowButton;
      Button bookNowButton = ViewBindings.findChildViewById(rootView, id);
      if (bookNowButton == null) {
        break missingId;
      }

      id = R.id.checkInDate;
      Button checkInDate = ViewBindings.findChildViewById(rootView, id);
      if (checkInDate == null) {
        break missingId;
      }

      id = R.id.checkOutDate;
      Button checkOutDate = ViewBindings.findChildViewById(rootView, id);
      if (checkOutDate == null) {
        break missingId;
      }

      id = R.id.contactButton;
      Button contactButton = ViewBindings.findChildViewById(rootView, id);
      if (contactButton == null) {
        break missingId;
      }

      id = R.id.hotelName;
      TextView hotelName = ViewBindings.findChildViewById(rootView, id);
      if (hotelName == null) {
        break missingId;
      }

      id = R.id.nestedScroll;
      NestedScrollView nestedScroll = ViewBindings.findChildViewById(rootView, id);
      if (nestedScroll == null) {
        break missingId;
      }

      id = R.id.roomPrice;
      TextView roomPrice = ViewBindings.findChildViewById(rootView, id);
      if (roomPrice == null) {
        break missingId;
      }

      id = R.id.selectVoucherButton;
      Button selectVoucherButton = ViewBindings.findChildViewById(rootView, id);
      if (selectVoucherButton == null) {
        break missingId;
      }

      id = R.id.selectedVoucherTextView;
      TextView selectedVoucherTextView = ViewBindings.findChildViewById(rootView, id);
      if (selectedVoucherTextView == null) {
        break missingId;
      }

      id = R.id.txtCheckin;
      TextView txtCheckin = ViewBindings.findChildViewById(rootView, id);
      if (txtCheckin == null) {
        break missingId;
      }

      id = R.id.txtCheckout;
      TextView txtCheckout = ViewBindings.findChildViewById(rootView, id);
      if (txtCheckout == null) {
        break missingId;
      }

      id = R.id.txtGiamGia;
      TextView txtGiamGia = ViewBindings.findChildViewById(rootView, id);
      if (txtGiamGia == null) {
        break missingId;
      }

      id = R.id.txtSoNgay;
      TextView txtSoNgay = ViewBindings.findChildViewById(rootView, id);
      if (txtSoNgay == null) {
        break missingId;
      }

      id = R.id.txtTotalPayment;
      TextView txtTotalPayment = ViewBindings.findChildViewById(rootView, id);
      if (txtTotalPayment == null) {
        break missingId;
      }

      return new ActivityBookingBinding((CoordinatorLayout) rootView, bannerImage, bookNowButton,
          checkInDate, checkOutDate, contactButton, hotelName, nestedScroll, roomPrice,
          selectVoucherButton, selectedVoucherTextView, txtCheckin, txtCheckout, txtGiamGia,
          txtSoNgay, txtTotalPayment);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
