package com.example.admin.mvpdemo.splash;

/**
 * Created by admin on 16-02-2017.
 */

public interface SplaceInteracto {
    void splaceAction(OnSplaceFineshListnor listnor);

    interface OnSplaceFineshListnor {
        void onSuccess();
    }
}
