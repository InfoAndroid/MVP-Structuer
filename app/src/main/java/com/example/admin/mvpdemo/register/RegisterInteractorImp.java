package com.example.admin.mvpdemo.register;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by admin on 16-02-2017.
 */

public class RegisterInteractorImp implements RegisterInteractor {


    @Override
    public void registerUser(String userName, String LastName, String phone, String password, final OnRegisterFineshListenar listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty("userName")) {
                    listener.userNameError();
                    error = true;
                    return;
                }
                if (TextUtils.isEmpty("LastName")) {
                    listener.lastUserNameError();
                    error = true;
                    return;
                }
                if (TextUtils.isEmpty("phone")) {
                    listener.phoneError();
                    error = true;
                    return;
                }
                if (TextUtils.isEmpty("password")) {
                    listener.passwordError();
                    error = true;
                    return;
                }
                if (!error) {
                    listener.onSuccess();
                    return;
                }

            }
        }, 3000);
    }
}
