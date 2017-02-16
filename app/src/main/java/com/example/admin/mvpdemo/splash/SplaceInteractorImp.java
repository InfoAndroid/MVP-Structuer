package com.example.admin.mvpdemo.splash;

import android.os.Handler;

/**
 * Created by admin on 16-02-2017.
 */

public class SplaceInteractorImp implements SplaceInteracto {
    @Override
    public void splaceAction(final OnSplaceFineshListnor listnor) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (!error) {
                    listnor.onSuccess();
                }
            }
        }, 3000);
    }
}
