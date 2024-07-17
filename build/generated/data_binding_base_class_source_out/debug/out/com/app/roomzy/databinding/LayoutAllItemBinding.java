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

public final class LayoutAllItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView pDesc;

  @NonNull
  public final ImageView pImage;

  @NonNull
  public final TextView pName;

  @NonNull
  public final TextView pPrice;

  @NonNull
  public final ImageView shareBtn;

  private LayoutAllItemBinding(@NonNull RelativeLayout rootView, @NonNull TextView pDesc,
      @NonNull ImageView pImage, @NonNull TextView pName, @NonNull TextView pPrice,
      @NonNull ImageView shareBtn) {
    this.rootView = rootView;
    this.pDesc = pDesc;
    this.pImage = pImage;
    this.pName = pName;
    this.pPrice = pPrice;
    this.shareBtn = shareBtn;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutAllItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutAllItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_all_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutAllItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pDesc;
      TextView pDesc = ViewBindings.findChildViewById(rootView, id);
      if (pDesc == null) {
        break missingId;
      }

      id = R.id.pImage;
      ImageView pImage = ViewBindings.findChildViewById(rootView, id);
      if (pImage == null) {
        break missingId;
      }

      id = R.id.pName;
      TextView pName = ViewBindings.findChildViewById(rootView, id);
      if (pName == null) {
        break missingId;
      }

      id = R.id.pPrice;
      TextView pPrice = ViewBindings.findChildViewById(rootView, id);
      if (pPrice == null) {
        break missingId;
      }

      id = R.id.shareBtn;
      ImageView shareBtn = ViewBindings.findChildViewById(rootView, id);
      if (shareBtn == null) {
        break missingId;
      }

      return new LayoutAllItemBinding((RelativeLayout) rootView, pDesc, pImage, pName, pPrice,
          shareBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
