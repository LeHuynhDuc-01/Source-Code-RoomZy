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

public final class LayoutAllCartBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView productPrice;

  private LayoutAllCartBinding(@NonNull RelativeLayout rootView, @NonNull ImageView productImage,
      @NonNull TextView productName, @NonNull TextView productPrice) {
    this.rootView = rootView;
    this.productImage = productImage;
    this.productName = productName;
    this.productPrice = productPrice;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutAllCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutAllCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_all_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutAllCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.productImage;
      ImageView productImage = ViewBindings.findChildViewById(rootView, id);
      if (productImage == null) {
        break missingId;
      }

      id = R.id.productName;
      TextView productName = ViewBindings.findChildViewById(rootView, id);
      if (productName == null) {
        break missingId;
      }

      id = R.id.productPrice;
      TextView productPrice = ViewBindings.findChildViewById(rootView, id);
      if (productPrice == null) {
        break missingId;
      }

      return new LayoutAllCartBinding((RelativeLayout) rootView, productImage, productName,
          productPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
