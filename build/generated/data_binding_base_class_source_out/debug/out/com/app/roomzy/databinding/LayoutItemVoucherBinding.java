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

public final class LayoutItemVoucherBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView voucherDescription;

  @NonNull
  public final TextView voucherDiscount;

  @NonNull
  public final ImageView voucherImage;

  @NonNull
  public final TextView voucherMaxDiscount;

  @NonNull
  public final TextView voucherName;

  private LayoutItemVoucherBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView voucherDescription, @NonNull TextView voucherDiscount,
      @NonNull ImageView voucherImage, @NonNull TextView voucherMaxDiscount,
      @NonNull TextView voucherName) {
    this.rootView = rootView;
    this.voucherDescription = voucherDescription;
    this.voucherDiscount = voucherDiscount;
    this.voucherImage = voucherImage;
    this.voucherMaxDiscount = voucherMaxDiscount;
    this.voucherName = voucherName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutItemVoucherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutItemVoucherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_item_voucher, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutItemVoucherBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.voucherDescription;
      TextView voucherDescription = ViewBindings.findChildViewById(rootView, id);
      if (voucherDescription == null) {
        break missingId;
      }

      id = R.id.voucherDiscount;
      TextView voucherDiscount = ViewBindings.findChildViewById(rootView, id);
      if (voucherDiscount == null) {
        break missingId;
      }

      id = R.id.voucherImage;
      ImageView voucherImage = ViewBindings.findChildViewById(rootView, id);
      if (voucherImage == null) {
        break missingId;
      }

      id = R.id.voucherMaxDiscount;
      TextView voucherMaxDiscount = ViewBindings.findChildViewById(rootView, id);
      if (voucherMaxDiscount == null) {
        break missingId;
      }

      id = R.id.voucherName;
      TextView voucherName = ViewBindings.findChildViewById(rootView, id);
      if (voucherName == null) {
        break missingId;
      }

      return new LayoutItemVoucherBinding((RelativeLayout) rootView, voucherDescription,
          voucherDiscount, voucherImage, voucherMaxDiscount, voucherName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
