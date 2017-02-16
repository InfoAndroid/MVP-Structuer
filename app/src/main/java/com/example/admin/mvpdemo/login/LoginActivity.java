package com.example.admin.mvpdemo.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.admin.mvpdemo.R;
import com.example.admin.mvpdemo.home.HomeActivity;


public class LoginActivity extends AppCompatActivity implements LoginView {
    private ProgressBar progressBar;
    private EditText username;
    private EditText password;
    private Button button;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);
        presenter = new LoginPresenterImp(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.validationCredentials(username.getText().toString(), password.getText().toString());
            }
        });

    }

    @Override
    protected void onDestroy() {
        presenter.onDestory();
        super.onDestroy();

    }

    @Override
    public void showPrograssBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void haidPrograssBar() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUserNameErrer() {
        username.setError(getString(R.string.username_error));
    }

    @Override
    public void setPasswordErrer() {
        password.setError(getString(R.string.password_error));
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

}
