package cn.bingoogolapple.androidcommon.adapter.databinding;
import cn.bingoogolapple.androidcommon.adapter.R;
import cn.bingoogolapple.androidcommon.adapter.BR;
import android.view.View;
public class BgaAdapterItemDatabindingDummyBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    private final android.view.View mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BgaAdapterItemDatabindingDummyBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.view.View) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.model :
            case BR.itemEventHandler :
            case BR.viewHolder :
                return true;
        }
        return false;
    }

    public void setModel(java.lang.Object model) {
        // not used, ignore
    }
    public java.lang.Object getModel() {
        return null;
    }
    public void setItemEventHandler(java.lang.Object itemEventHandler) {
        // not used, ignore
    }
    public java.lang.Object getItemEventHandler() {
        return null;
    }
    public void setViewHolder(cn.bingoogolapple.androidcommon.adapter.BGABindingViewHolder viewHolder) {
        // not used, ignore
    }
    public cn.bingoogolapple.androidcommon.adapter.BGABindingViewHolder getViewHolder() {
        return null;
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

    public static BgaAdapterItemDatabindingDummyBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static BgaAdapterItemDatabindingDummyBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<BgaAdapterItemDatabindingDummyBinding>inflate(inflater, cn.bingoogolapple.androidcommon.adapter.R.layout.bga_adapter_item_databinding_dummy, root, attachToRoot, bindingComponent);
    }
    public static BgaAdapterItemDatabindingDummyBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static BgaAdapterItemDatabindingDummyBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(cn.bingoogolapple.androidcommon.adapter.R.layout.bga_adapter_item_databinding_dummy, null, false), bindingComponent);
    }
    public static BgaAdapterItemDatabindingDummyBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static BgaAdapterItemDatabindingDummyBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/bga_adapter_item_databinding_dummy_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new BgaAdapterItemDatabindingDummyBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): itemEventHandler
        flag 2 (0x3L): viewHolder
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}