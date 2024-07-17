// Generated by data binding compiler. Do not edit!
package com.app.roomzy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.app.roomzy.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityViewAllBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView allProductsView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView title;

  @NonNull
  public final RelativeLayout txt3;

  protected ActivityViewAllBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView allProductsView, ProgressBar progressBar, TextView title, RelativeLayout txt3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.allProductsView = allProductsView;
    this.progressBar = progressBar;
    this.title = title;
    this.txt3 = txt3;
  }

  @NonNull
  public static ActivityViewAllBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_view_all, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityViewAllBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityViewAllBinding>inflateInternal(inflater, R.layout.activity_view_all, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityViewAllBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_view_all, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityViewAllBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityViewAllBinding>inflateInternal(inflater, R.layout.activity_view_all, null, false, component);
  }

  public static ActivityViewAllBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityViewAllBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityViewAllBinding)bind(component, view, R.layout.activity_view_all);
  }
}
