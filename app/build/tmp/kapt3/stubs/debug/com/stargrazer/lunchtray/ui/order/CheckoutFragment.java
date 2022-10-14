package com.stargrazer.lunchtray.ui.order;

import java.lang.System;

/**
 * [CheckoutFragment] allows people to apply a coupon to their order, submit order, or cancel order.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0006\u0010\u001b\u001a\u00020\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/stargrazer/lunchtray/ui/order/CheckoutFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/stargrazer/lunchtray/databinding/FragmentCheckoutBinding;", "binding", "getBinding", "()Lcom/stargrazer/lunchtray/databinding/FragmentCheckoutBinding;", "sharedViewModel", "Lcom/stargrazer/lunchtray/model/OrderViewModel;", "getSharedViewModel", "()Lcom/stargrazer/lunchtray/model/OrderViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "cancelOrder", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "submitOrder", "app_debug"})
public final class CheckoutFragment extends androidx.fragment.app.Fragment {
    private com.stargrazer.lunchtray.databinding.FragmentCheckoutBinding _binding;
    private final kotlin.Lazy sharedViewModel$delegate = null;
    
    public CheckoutFragment() {
        super();
    }
    
    private final com.stargrazer.lunchtray.databinding.FragmentCheckoutBinding getBinding() {
        return null;
    }
    
    private final com.stargrazer.lunchtray.model.OrderViewModel getSharedViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Cancel the order and start over.
     */
    public final void cancelOrder() {
    }
    
    /**
     * Submit order and navigate to home screen.
     */
    public final void submitOrder() {
    }
    
    /**
     * This fragment lifecycle method is called when the view hierarchy associated with the fragment
     * is being removed. As a result, clear out the binding object.
     */
    @java.lang.Override()
    public void onDestroyView() {
    }
}