package com.example.admin.mvpdemo.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.mvpdemo.R;
import com.example.admin.mvpdemo.register.RegisterActivity;

public class SplashActivity extends AppCompatActivity implements SplaceView {
    private SplacePresenter splacePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splacePresenter = new SplashPresenterImp(this);
    }

    @Override
    public void navigateToRegister() {
        startActivity(new Intent(this, RegisterActivity.class));
        finish();
    }

    @Override
    protected void onDestroy() {
        splacePresenter.onDestory();
        super.onDestroy();
    }
}
