package com.example.admin.mvpdemo.register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.admin.mvpdemo.R;
import com.example.admin.mvpdemo.login.LoginActivity;

public class RegisterActivity extends AppCompatActivity implements RegisterView {
    private ProgressBar progressBar;
    private EditText userName;
    private EditText lastUserName;
    private EditText phone;
    private EditText password;
    private Button singUp;
    private RegisterPresenter registerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        progressBar = (ProgressBar) findViewById(R.id.progress);
        userName = (EditText) findViewById(R.id.username);
        lastUserName = (EditText) findViewById(R.id.user_last_name);
        phone = (EditText) findViewById(R.id.user_phone);
        password = (EditText) findViewById(R.id.password);
        singUp = (Button) findViewById(R.id.button);
        registerPresenter = new RegisterPresenterImp(this);
        singUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerPresenter.validationCredentials(userName.getText().toString(),
                        lastUserName.getText().toString(),
                        phone.getText().toString(),
                        password.getText().toString());
            }
        });
    }

    @Override
    protected void onDestroy() {
        registerPresenter.onDestory();
        super.onDestroy();
    }

    @Override
    public void showPrograssBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hidePrograssBar() {
        progressBar.setVisibility(View.GONE);

    }

    @Override
    public void setUserNameError() {
        userName.setError(getString(R.string.username_error));
    }

    @Override
    public void setUserLastNameError() {
        lastUserName.setError(getString(R.string.user_last_name));
    }

    @Override
    public void setPhoneError() {
        phone.setError(getString(R.string.user_phone));
    }

    @Override
    public void setPasswordError() {
        userName.setError(getString(R.string.password_error));
    }

    @Override
    public void setNavigate() {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}
