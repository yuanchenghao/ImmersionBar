package com.gyf.immersionbar.fragment;

/**
 * Created by geyifeng on 2017/7/22.
 */

public abstract class BaseNoImmersionFragment extends BaseLazyFragment {

    @Override
    protected boolean isImmersionBarEnabled() {
        return false;
    }
}