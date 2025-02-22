// Generated by data binding compiler. Do not edit!
package com.app.roomzy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.app.roomzy.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityBookingHistoryBinding extends ViewDataBinding {
  @NonNull
  public final Button backBtn;

  @NonNull
  public final RecyclerView bookingRecyclerView;

  @NonNull
  public final ImageView emptyBookingImage;

  @NonNull
  public final RelativeLayout headerLayout;

  protected ActivityBookingHistoryBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button backBtn, RecyclerView bookingRecyclerView,
      ImageView emptyBookingImage, RelativeLayout headerLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backBtn = backBtn;
    this.bookingRecyclerView = bookingRecyclerView;
    this.emptyBookingImage = emptyBookingImage;
    this.headerLayout = headerLayout;
  }

  @NonNull
  public static ActivityBookingHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_booking_history, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityBookingHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityBookingHistoryBinding>inflateInternal(inflater, R.layout.activity_booking_history, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityBookingHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_booking_history, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityBookingHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityBookingHistoryBinding>inflateInternal(inflater, R.layout.activity_booking_history, null, false, component);
  }

  public static ActivityBookingHistoryBinding bind(@NonNull View view) {
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
  public static ActivityBookingHistoryBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityBookingHistoryBinding)bind(component, view, R.layout.activity_booking_history);
  }
}
