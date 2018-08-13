package com.tushar.mvpilogin.login;

import android.text.TextUtils;

public class LoginInteractorImpl implements LoginInteractor  {
    @Override
    public void onLogin(String username, String password, onLoginListener listener) {
        if (TextUtils.isEmpty(username)){
            listener.onUserNameError();
        } else if (TextUtils.isEmpty(password)){
            listener.onPasswordError();
        }else if(username.equals("username")&& password.equals("password")){
            listener.onSuccess();
        }else {

            listener.failure("Something went wrong");
        }
    }
}
