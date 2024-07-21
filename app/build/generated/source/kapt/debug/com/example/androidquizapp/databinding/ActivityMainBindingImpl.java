package com.example.androidquizapp.databinding;
import com.example.androidquizapp.R;
import com.example.androidquizapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.example.androidquizapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.Button mboundView2;
    @NonNull
    private final android.widget.Button mboundView3;
    @NonNull
    private final android.widget.Button mboundView4;
    @NonNull
    private final android.widget.Button mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.LinearLayout) bindings[0]
            );
        this.main.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.androidquizapp.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.example.androidquizapp.generated.callback.OnClickListener(this, 4);
        mCallback1 = new com.example.androidquizapp.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.androidquizapp.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.androidquizapp.QuizViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.androidquizapp.QuizViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelOptionOne((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelOptionTwo((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelOptionFour((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelQuestionText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelOptionThree((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelOptionOne(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelOptionOne, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOptionTwo(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelOptionTwo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOptionFour(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelOptionFour, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelQuestionText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelQuestionText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOptionThree(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelOptionThree, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String viewModelOptionOneGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelOptionOne = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelOptionTwo = null;
        java.lang.String viewModelOptionThreeGetValue = null;
        java.lang.String viewModelOptionFourGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelOptionFour = null;
        java.lang.String viewModelOptionTwoGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelQuestionText = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelOptionThree = null;
        java.lang.String viewModelQuestionTextGetValue = null;
        com.example.androidquizapp.QuizViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.optionOne
                        viewModelOptionOne = viewModel.getOptionOne();
                    }
                    updateLiveDataRegistration(0, viewModelOptionOne);


                    if (viewModelOptionOne != null) {
                        // read viewModel.optionOne.getValue()
                        viewModelOptionOneGetValue = viewModelOptionOne.getValue();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.optionTwo
                        viewModelOptionTwo = viewModel.getOptionTwo();
                    }
                    updateLiveDataRegistration(1, viewModelOptionTwo);


                    if (viewModelOptionTwo != null) {
                        // read viewModel.optionTwo.getValue()
                        viewModelOptionTwoGetValue = viewModelOptionTwo.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.optionFour
                        viewModelOptionFour = viewModel.getOptionFour();
                    }
                    updateLiveDataRegistration(2, viewModelOptionFour);


                    if (viewModelOptionFour != null) {
                        // read viewModel.optionFour.getValue()
                        viewModelOptionFourGetValue = viewModelOptionFour.getValue();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.questionText
                        viewModelQuestionText = viewModel.getQuestionText();
                    }
                    updateLiveDataRegistration(3, viewModelQuestionText);


                    if (viewModelQuestionText != null) {
                        // read viewModel.questionText.getValue()
                        viewModelQuestionTextGetValue = viewModelQuestionText.getValue();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.optionThree
                        viewModelOptionThree = viewModel.getOptionThree();
                    }
                    updateLiveDataRegistration(4, viewModelOptionThree);


                    if (viewModelOptionThree != null) {
                        // read viewModel.optionThree.getValue()
                        viewModelOptionThreeGetValue = viewModelOptionThree.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelQuestionTextGetValue);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback1);
            this.mboundView3.setOnClickListener(mCallback2);
            this.mboundView4.setOnClickListener(mCallback3);
            this.mboundView5.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelOptionOneGetValue);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelOptionTwoGetValue);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelOptionThreeGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelOptionFourGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.androidquizapp.QuizViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onButtonClick(3);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.androidquizapp.QuizViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onButtonClick(4);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.androidquizapp.QuizViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onButtonClick(1);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.androidquizapp.QuizViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onButtonClick(2);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.optionOne
        flag 1 (0x2L): viewModel.optionTwo
        flag 2 (0x3L): viewModel.optionFour
        flag 3 (0x4L): viewModel.questionText
        flag 4 (0x5L): viewModel.optionThree
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}