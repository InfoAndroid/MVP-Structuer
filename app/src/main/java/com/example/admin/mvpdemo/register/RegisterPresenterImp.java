package com.example.admin.mvpdemo.register;

/**
 * Created by admin on 16-02-2017.
 */

public class RegisterPresenterImp implements RegisterPresenter, RegisterInteractor.OnRegisterFineshListenar {
    private RegisterView registerView;
    private RegisterInteractor registerInteractor;

    public RegisterPresenterImp(RegisterView registerView) {
        this.registerView = registerView;
        this.registerInteractor = new RegisterInteractorImp();
    }

    @Override
    public void validationCredentials(String name, String lastName, String phone, String password) {
        if (registerView != null) {
            registerView.showPrograssBar();
        }
        registerInteractor.registerUser(name, lastName, phone, password, this);

    }

    @Override
    public void onDestory() {
        registerView = null;
    }

    @Override
    public void userNameError() {
        if (registerView != null) {
            registerView.setUserNameError();
            registerView.hidePrograssBar();
        }
    }

    @Override
    public void passwordError() {
        if (registerView != null) {
            registerView.setPasswordError();
            registerView.hidePrograssBar();
        }
    }

    @Override
    public void lastUserNameError() {
        if (registerView != null) {
            registerView.setUserLastNameError();
            registerView.hidePrograssBar();
        }
    }

    @Override
    public void phoneError() {
        if (registerView != null) {
            registerView.setPhoneError();
            registerView.hidePrograssBar();
        }
    }

    @Override
    public void onSuccess() {
        if (registerView != null) {
            registerView.setNavigate();
        }
    }
}
