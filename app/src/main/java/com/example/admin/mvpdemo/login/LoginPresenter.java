package com.example.admin.mvpdemo.login;

/**
 * Created by admin on 16-02-2017.
 */

public interface LoginPresenter {
    void validationCredentials(String username, String password);

    void onDestory();
}
