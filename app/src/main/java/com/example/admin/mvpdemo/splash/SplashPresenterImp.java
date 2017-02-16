package com.example.admin.mvpdemo.splash;

/**
 * Created by admin on 16-02-2017.
 */

public class SplashPresenterImp implements SplacePresenter, SplaceInteracto.OnSplaceFineshListnor {
    private SplaceView splaceView;
    private SplaceInteracto splaceInteracto;

    public SplashPresenterImp(SplaceView splaceView) {
        this.splaceView = splaceView;
        this.splaceInteracto = new SplaceInteractorImp();
        splaceInteracto.splaceAction(this);
    }

    @Override
    public void onDestory() {
        splaceView = null;
    }

    @Override
    public void onSuccess() {
        if (splaceView != null) {
            splaceView.navigateToRegister();
        }
    }
}
