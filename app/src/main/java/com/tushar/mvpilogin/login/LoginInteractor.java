package com.tushar.mvpilogin.login;

public interface LoginInteractor {

    interface onLoginListener{

        void onSuccess();
        void failure(String message);
        void onUserNameError();
        void onPasswordError();
    }

    void onLogin(String username, String password, onLoginListener listener);
}
