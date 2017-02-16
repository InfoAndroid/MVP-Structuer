package com.example.admin.mvpdemo.register;

/**
 * Created by admin on 16-02-2017.
 */

public interface RegisterInteractor {
    void registerUser(String userName, String LastName, String phone, String password, OnRegisterFineshListenar listener);

    interface OnRegisterFineshListenar {
        void userNameError();

        void passwordError();

        void lastUserNameError();

        void phoneError();

        void onSuccess();
    }
}
