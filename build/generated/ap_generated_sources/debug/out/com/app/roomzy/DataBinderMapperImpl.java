package com.app.roomzy;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.app.roomzy.databinding.ActivityBookingHistoryBindingImpl;
import com.app.roomzy.databinding.ActivityCartBindingImpl;
import com.app.roomzy.databinding.ActivityHistoryBindingImpl;
import com.app.roomzy.databinding.ActivityMainBindingImpl;
import com.app.roomzy.databinding.ActivityViewAllBindingImpl;
import com.app.roomzy.databinding.ActivityVoucherBindingImpl;
import com.app.roomzy.databinding.FragmentProposeBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBOOKINGHISTORY = 1;

  private static final int LAYOUT_ACTIVITYCART = 2;

  private static final int LAYOUT_ACTIVITYHISTORY = 3;

  private static final int LAYOUT_ACTIVITYMAIN = 4;

  private static final int LAYOUT_ACTIVITYVIEWALL = 5;

  private static final int LAYOUT_ACTIVITYVOUCHER = 6;

  private static final int LAYOUT_FRAGMENTPROPOSE = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.roomzy.R.layout.activity_booking_history, LAYOUT_ACTIVITYBOOKINGHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.roomzy.R.layout.activity_cart, LAYOUT_ACTIVITYCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.roomzy.R.layout.activity_history, LAYOUT_ACTIVITYHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.roomzy.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.roomzy.R.layout.activity_view_all, LAYOUT_ACTIVITYVIEWALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.roomzy.R.layout.activity_voucher, LAYOUT_ACTIVITYVOUCHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.roomzy.R.layout.fragment_propose, LAYOUT_FRAGMENTPROPOSE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBOOKINGHISTORY: {
          if ("layout/activity_booking_history_0".equals(tag)) {
            return new ActivityBookingHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_booking_history is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCART: {
          if ("layout/activity_cart_0".equals(tag)) {
            return new ActivityCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHISTORY: {
          if ("layout/activity_history_0".equals(tag)) {
            return new ActivityHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_history is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVIEWALL: {
          if ("layout/activity_view_all_0".equals(tag)) {
            return new ActivityViewAllBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_view_all is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVOUCHER: {
          if ("layout/activity_voucher_0".equals(tag)) {
            return new ActivityVoucherBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_voucher is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROPOSE: {
          if ("layout/fragment_propose_0".equals(tag)) {
            return new FragmentProposeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_propose is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_booking_history_0", com.app.roomzy.R.layout.activity_booking_history);
      sKeys.put("layout/activity_cart_0", com.app.roomzy.R.layout.activity_cart);
      sKeys.put("layout/activity_history_0", com.app.roomzy.R.layout.activity_history);
      sKeys.put("layout/activity_main_0", com.app.roomzy.R.layout.activity_main);
      sKeys.put("layout/activity_view_all_0", com.app.roomzy.R.layout.activity_view_all);
      sKeys.put("layout/activity_voucher_0", com.app.roomzy.R.layout.activity_voucher);
      sKeys.put("layout/fragment_propose_0", com.app.roomzy.R.layout.fragment_propose);
    }
  }
}
