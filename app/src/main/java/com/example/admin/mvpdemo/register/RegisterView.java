package com.example.admin.mvpdemo.register;

/**
 * Created by admin on 16-02-2017.
 */

public interface RegisterView {
    void showPrograssBar();

    void hidePrograssBar();

    void setUserNameError();

    void setUserLastNameError();

    void setPhoneError();

    void setPasswordError();

    void setNavigate();

}
