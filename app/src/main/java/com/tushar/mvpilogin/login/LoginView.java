package com.tushar.mvpilogin.login;

public interface LoginView {

    void setUsernameError();
    void setPasswordError();
    void setNavigation();
    void showMessage(String message);

}
