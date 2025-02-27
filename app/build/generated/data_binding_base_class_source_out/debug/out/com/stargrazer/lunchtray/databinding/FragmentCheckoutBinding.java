// Generated by data binding compiler. Do not edit!
package com.stargrazer.lunchtray.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.stargrazer.lunchtray.R;
import com.stargrazer.lunchtray.model.OrderViewModel;
import com.stargrazer.lunchtray.ui.order.CheckoutFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCheckoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView accompanimentPrice;

  @NonNull
  public final TextView accompanimentSelection;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final View divider;

  @NonNull
  public final TextView entreePrice;

  @NonNull
  public final TextView entreeSelection;

  @NonNull
  public final TextView orderSummary;

  @NonNull
  public final TextView sidePrice;

  @NonNull
  public final TextView sideSelection;

  @NonNull
  public final Button submitButton;

  @NonNull
  public final TextView subtotal;

  @NonNull
  public final TextView tax;

  @NonNull
  public final TextView total;

  @Bindable
  protected OrderViewModel mViewModel;

  @Bindable
  protected CheckoutFragment mCheckoutFragment;

  protected FragmentCheckoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView accompanimentPrice, TextView accompanimentSelection, Button cancelButton,
      View divider, TextView entreePrice, TextView entreeSelection, TextView orderSummary,
      TextView sidePrice, TextView sideSelection, Button submitButton, TextView subtotal,
      TextView tax, TextView total) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accompanimentPrice = accompanimentPrice;
    this.accompanimentSelection = accompanimentSelection;
    this.cancelButton = cancelButton;
    this.divider = divider;
    this.entreePrice = entreePrice;
    this.entreeSelection = entreeSelection;
    this.orderSummary = orderSummary;
    this.sidePrice = sidePrice;
    this.sideSelection = sideSelection;
    this.submitButton = submitButton;
    this.subtotal = subtotal;
    this.tax = tax;
    this.total = total;
  }

  public abstract void setViewModel(@Nullable OrderViewModel viewModel);

  @Nullable
  public OrderViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setCheckoutFragment(@Nullable CheckoutFragment checkoutFragment);

  @Nullable
  public CheckoutFragment getCheckoutFragment() {
    return mCheckoutFragment;
  }

  @NonNull
  public static FragmentCheckoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_checkout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCheckoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCheckoutBinding>inflateInternal(inflater, R.layout.fragment_checkout, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCheckoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_checkout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCheckoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCheckoutBinding>inflateInternal(inflater, R.layout.fragment_checkout, null, false, component);
  }

  public static FragmentCheckoutBinding bind(@NonNull View view) {
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
  public static FragmentCheckoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCheckoutBinding)bind(component, view, R.layout.fragment_checkout);
  }
}
