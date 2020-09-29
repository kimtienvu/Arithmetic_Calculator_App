package com.example.calculator.databinding;
import com.example.calculator.R;
import com.example.calculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.infoTextView, 1);
        sViewsWithIds.put(R.id.editText, 2);
        sViewsWithIds.put(R.id.buttonEqual, 3);
        sViewsWithIds.put(R.id.buttonOne, 4);
        sViewsWithIds.put(R.id.buttonTwo, 5);
        sViewsWithIds.put(R.id.buttonFour, 6);
        sViewsWithIds.put(R.id.buttonFive, 7);
        sViewsWithIds.put(R.id.buttonSeven, 8);
        sViewsWithIds.put(R.id.buttonEight, 9);
        sViewsWithIds.put(R.id.buttonNine, 10);
        sViewsWithIds.put(R.id.buttonThree, 11);
        sViewsWithIds.put(R.id.buttonSix, 12);
        sViewsWithIds.put(R.id.buttonDot, 13);
        sViewsWithIds.put(R.id.buttonZero, 14);
        sViewsWithIds.put(R.id.buttonClear, 15);
        sViewsWithIds.put(R.id.buttonSubtract, 16);
        sViewsWithIds.put(R.id.buttonDivide, 17);
        sViewsWithIds.put(R.id.buttonMultiply, 18);
        sViewsWithIds.put(R.id.buttonAdd, 19);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.Button) bindings[19]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[18]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[16]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[14]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.activityMain.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}