package com.tushar.mvpilogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tushar.mvpilogin.login.LoginPresenter;
import com.tushar.mvpilogin.login.LoginPresenterImpl;
import com.tushar.mvpilogin.login.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView {

    EditText user_name, password;
    Button login;
    LoginPresenter loginpresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginpresenter = new LoginPresenterImpl(this);
        user_name = (EditText) findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);
        login= (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginpresenter.login(user_name.getText().toString(),password.getText().toString());
            }
        });
    }

    @Override
    public void setUsernameError() {
        user_name.setError("Username Empty");
    }

    @Override
    public void setPasswordError() {
        password.setError("password Empty");
    }

    @Override
    public void setNavigation() {
        startActivity(new Intent(LoginActivity.this,MainActivity.class));
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
