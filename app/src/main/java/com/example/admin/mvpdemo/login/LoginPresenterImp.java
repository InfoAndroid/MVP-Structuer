package com.example.admin.mvpdemo.login;

/**
 * Created by admin on 16-02-2017.
 */

public class LoginPresenterImp implements LoginPresenter, LoginInteractor.OnLoginFinishedListener {
    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImp(LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validationCredentials(String username, String password) {
        if (loginView != null) {
            loginView.showPrograssBar();
        }
        loginInteractor.login(username, password, this);
    }

    @Override
    public void onDestory() {
        loginView = null;
    }

    @Override
    public void onUsernameError() {
        if (loginView != null) {
            loginView.setUserNameErrer();
            loginView.haidPrograssBar();
        }
    }

    @Override
    public void onPasswordError() {
        if (loginView != null) {
            loginView.setPasswordErrer();
            loginView.haidPrograssBar();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.navigateToHome();
        }
    }
}
