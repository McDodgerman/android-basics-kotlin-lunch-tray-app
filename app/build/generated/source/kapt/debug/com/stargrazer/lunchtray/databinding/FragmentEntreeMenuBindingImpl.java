package com.stargrazer.lunchtray.databinding;
import com.stargrazer.lunchtray.R;
import com.stargrazer.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEntreeMenuBindingImpl extends FragmentEntreeMenuBinding implements com.stargrazer.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.entree_options, 16);
        sViewsWithIds.put(R.id.divider, 17);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEntreeMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentEntreeMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[14]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[17]
            , (android.widget.RadioGroup) bindings[16]
            , (android.widget.Button) bindings[15]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            );
        this.cancelButton.setTag(null);
        this.cauliflower.setTag(null);
        this.cauliflowerDescription.setTag(null);
        this.cauliflowerPrice.setTag(null);
        this.chili.setTag(null);
        this.chiliDescription.setTag(null);
        this.chiliPrice.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.pasta.setTag(null);
        this.pastaDescription.setTag(null);
        this.pastaPrice.setTag(null);
        this.skillet.setTag(null);
        this.skilletDescription.setTag(null);
        this.skilletPrice.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.stargrazer.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback19 = new com.stargrazer.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback16 = new com.stargrazer.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback17 = new com.stargrazer.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback14 = new com.stargrazer.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback18 = new com.stargrazer.lunchtray.generated.callback.OnClickListener(this, 5);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.entreeMenuFragment == variableId) {
            setEntreeMenuFragment((com.stargrazer.lunchtray.ui.order.EntreeMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.stargrazer.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEntreeMenuFragment(@Nullable com.stargrazer.lunchtray.ui.order.EntreeMenuFragment EntreeMenuFragment) {
        this.mEntreeMenuFragment = EntreeMenuFragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.entreeMenuFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.stargrazer.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelEntree((androidx.lifecycle.LiveData<com.stargrazer.lunchtray.model.MenuItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEntree(androidx.lifecycle.LiveData<com.stargrazer.lunchtray.model.MenuItem> ViewModelEntree, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        java.lang.String viewModelMenuItemsSkilletGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsPastaName = null;
        com.stargrazer.lunchtray.model.MenuItem viewModelMenuItemsPasta = null;
        java.lang.String viewModelMenuItemsSkilletName = null;
        java.util.Map<java.lang.String,com.stargrazer.lunchtray.model.MenuItem> viewModelMenuItems = null;
        com.stargrazer.lunchtray.model.MenuItem viewModelEntreeGetValue = null;
        java.lang.String viewModelMenuItemsCauliflowerGetFormattedPrice = null;
        com.stargrazer.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
        java.lang.String viewModelMenuItemsSkilletDescription = null;
        com.stargrazer.lunchtray.model.MenuItem viewModelMenuItemsCauliflower = null;
        com.stargrazer.lunchtray.model.MenuItem viewModelMenuItemsSkillet = null;
        java.lang.String viewModelMenuItemsChiliDescription = null;
        java.lang.String viewModelMenuItemsChiliGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsCauliflowerName = null;
        java.lang.String viewModelMenuItemsPastaGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsPastaDescription = null;
        boolean viewModelEntreeEqualsViewModelMenuItemsPasta = false;
        boolean viewModelEntreeEqualsViewModelMenuItemsSkillet = false;
        java.lang.String viewModelMenuItemsCauliflowerDescription = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        boolean viewModelEntreeEqualsViewModelMenuItemsChili = false;
        java.lang.String viewModelSubtotalGetValue = null;
        java.lang.String viewModelMenuItemsChiliName = null;
        androidx.lifecycle.LiveData<com.stargrazer.lunchtray.model.MenuItem> viewModelEntree = null;
        com.stargrazer.lunchtray.model.MenuItem viewModelMenuItemsChili = null;
        boolean viewModelEntreeEqualsViewModelMenuItemsCauliflower = false;
        com.stargrazer.lunchtray.model.OrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.subtotal
                        viewModelSubtotal = viewModel.getSubtotal();
                    }
                    updateLiveDataRegistration(0, viewModelSubtotal);


                    if (viewModelSubtotal != null) {
                        // read viewModel.subtotal.getValue()
                        viewModelSubtotalGetValue = viewModelSubtotal.getValue();
                    }


                    // read @android:string/subtotal
                    subtotalAndroidStringSubtotalViewModelSubtotal = subtotal.getResources().getString(R.string.subtotal, viewModelSubtotalGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.menuItems
                        viewModelMenuItems = viewModel.getMenuItems();
                        // read viewModel.entree
                        viewModelEntree = viewModel.getEntree();
                    }
                    updateLiveDataRegistration(1, viewModelEntree);


                    if (viewModelMenuItems != null) {
                        // read viewModel.menuItems["pasta"]
                        viewModelMenuItemsPasta = viewModelMenuItems.get("pasta");
                        // read viewModel.menuItems["cauliflower"]
                        viewModelMenuItemsCauliflower = viewModelMenuItems.get("cauliflower");
                        // read viewModel.menuItems["skillet"]
                        viewModelMenuItemsSkillet = viewModelMenuItems.get("skillet");
                        // read viewModel.menuItems["chili"]
                        viewModelMenuItemsChili = viewModelMenuItems.get("chili");
                    }
                    if (viewModelEntree != null) {
                        // read viewModel.entree.getValue()
                        viewModelEntreeGetValue = viewModelEntree.getValue();
                    }

                if ((dirtyFlags & 0x18L) != 0) {

                        if (viewModelMenuItemsPasta != null) {
                            // read viewModel.menuItems["pasta"].name
                            viewModelMenuItemsPastaName = viewModelMenuItemsPasta.getName();
                            // read viewModel.menuItems["pasta"].getFormattedPrice()
                            viewModelMenuItemsPastaGetFormattedPrice = viewModelMenuItemsPasta.getFormattedPrice();
                            // read viewModel.menuItems["pasta"].description
                            viewModelMenuItemsPastaDescription = viewModelMenuItemsPasta.getDescription();
                        }
                        if (viewModelMenuItemsCauliflower != null) {
                            // read viewModel.menuItems["cauliflower"].getFormattedPrice()
                            viewModelMenuItemsCauliflowerGetFormattedPrice = viewModelMenuItemsCauliflower.getFormattedPrice();
                            // read viewModel.menuItems["cauliflower"].name
                            viewModelMenuItemsCauliflowerName = viewModelMenuItemsCauliflower.getName();
                            // read viewModel.menuItems["cauliflower"].description
                            viewModelMenuItemsCauliflowerDescription = viewModelMenuItemsCauliflower.getDescription();
                        }
                        if (viewModelMenuItemsSkillet != null) {
                            // read viewModel.menuItems["skillet"].getFormattedPrice()
                            viewModelMenuItemsSkilletGetFormattedPrice = viewModelMenuItemsSkillet.getFormattedPrice();
                            // read viewModel.menuItems["skillet"].name
                            viewModelMenuItemsSkilletName = viewModelMenuItemsSkillet.getName();
                            // read viewModel.menuItems["skillet"].description
                            viewModelMenuItemsSkilletDescription = viewModelMenuItemsSkillet.getDescription();
                        }
                        if (viewModelMenuItemsChili != null) {
                            // read viewModel.menuItems["chili"].description
                            viewModelMenuItemsChiliDescription = viewModelMenuItemsChili.getDescription();
                            // read viewModel.menuItems["chili"].getFormattedPrice()
                            viewModelMenuItemsChiliGetFormattedPrice = viewModelMenuItemsChili.getFormattedPrice();
                            // read viewModel.menuItems["chili"].name
                            viewModelMenuItemsChiliName = viewModelMenuItemsChili.getName();
                        }
                }

                    if (viewModelEntreeGetValue != null) {
                        // read viewModel.entree.getValue().equals(viewModel.menuItems["pasta"])
                        viewModelEntreeEqualsViewModelMenuItemsPasta = viewModelEntreeGetValue.equals(viewModelMenuItemsPasta);
                        // read viewModel.entree.getValue().equals(viewModel.menuItems["skillet"])
                        viewModelEntreeEqualsViewModelMenuItemsSkillet = viewModelEntreeGetValue.equals(viewModelMenuItemsSkillet);
                        // read viewModel.entree.getValue().equals(viewModel.menuItems["chili"])
                        viewModelEntreeEqualsViewModelMenuItemsChili = viewModelEntreeGetValue.equals(viewModelMenuItemsChili);
                        // read viewModel.entree.getValue().equals(viewModel.menuItems["cauliflower"])
                        viewModelEntreeEqualsViewModelMenuItemsCauliflower = viewModelEntreeGetValue.equals(viewModelMenuItemsCauliflower);
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback18);
            this.cauliflower.setOnClickListener(mCallback14);
            this.chili.setOnClickListener(mCallback15);
            this.nextButton.setOnClickListener(mCallback19);
            this.pasta.setOnClickListener(mCallback16);
            this.skillet.setOnClickListener(mCallback17);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflower, viewModelMenuItemsCauliflowerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflowerDescription, viewModelMenuItemsCauliflowerDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflowerPrice, viewModelMenuItemsCauliflowerGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chili, viewModelMenuItemsChiliName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chiliDescription, viewModelMenuItemsChiliDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chiliPrice, viewModelMenuItemsChiliGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pasta, viewModelMenuItemsPastaName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pastaDescription, viewModelMenuItemsPastaDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pastaPrice, viewModelMenuItemsPastaGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skillet, viewModelMenuItemsSkilletName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skilletDescription, viewModelMenuItemsSkilletDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skilletPrice, viewModelMenuItemsSkilletGetFormattedPrice);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.cauliflower, viewModelEntreeEqualsViewModelMenuItemsCauliflower);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chili, viewModelEntreeEqualsViewModelMenuItemsChili);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.pasta, viewModelEntreeEqualsViewModelMenuItemsPasta);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.skillet, viewModelEntreeEqualsViewModelMenuItemsSkillet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelSubtotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.stargrazer.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("chili");
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // entreeMenuFragment
                com.stargrazer.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
                // entreeMenuFragment != null
                boolean entreeMenuFragmentJavaLangObjectNull = false;



                entreeMenuFragmentJavaLangObjectNull = (entreeMenuFragment) != (null);
                if (entreeMenuFragmentJavaLangObjectNull) {


                    entreeMenuFragment.goToNextScreen();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.stargrazer.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("pasta");
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.stargrazer.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("skillet");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.stargrazer.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("cauliflower");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // entreeMenuFragment
                com.stargrazer.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
                // entreeMenuFragment != null
                boolean entreeMenuFragmentJavaLangObjectNull = false;



                entreeMenuFragmentJavaLangObjectNull = (entreeMenuFragment) != (null);
                if (entreeMenuFragmentJavaLangObjectNull) {


                    entreeMenuFragment.cancelOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): viewModel.entree
        flag 2 (0x3L): entreeMenuFragment
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}