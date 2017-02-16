package com.example.admin.mvpdemo.register;

/**
 * Created by admin on 16-02-2017.
 */

public interface RegisterPresenter {
    void validationCredentials(String name, String lastName, String phone, String password);

    void onDestory();
}
