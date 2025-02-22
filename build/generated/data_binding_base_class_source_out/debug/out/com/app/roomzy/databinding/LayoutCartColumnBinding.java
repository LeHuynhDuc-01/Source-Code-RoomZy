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

public final class LayoutCartColumnBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView productDesc2;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView productPrice;

  private LayoutCartColumnBinding(@NonNull RelativeLayout rootView, @NonNull TextView productDesc2,
      @NonNull ImageView productImage, @NonNull TextView productName,
      @NonNull TextView productPrice) {
    this.rootView = rootView;
    this.productDesc2 = productDesc2;
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
  public static LayoutCartColumnBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutCartColumnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_cart_column, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutCartColumnBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.productDesc2;
      TextView productDesc2 = ViewBindings.findChildViewById(rootView, id);
      if (productDesc2 == null) {
        break missingId;
      }

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

      return new LayoutCartColumnBinding((RelativeLayout) rootView, productDesc2, productImage,
          productName, productPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
