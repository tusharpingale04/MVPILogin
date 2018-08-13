package com.tushar.mvpilogin.login;

public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.onLoginListener {

    LoginView loginView;
    LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void login(String name, String password) {

        loginInteractor.onLogin(name,password,this);

    }

    @Override
    public void onSuccess() {

        if (loginView!=null)

            loginView.setNavigation();


    }

    @Override
    public void failure(String message) {
        if (loginView!=null)
            loginView.showMessage(message);

    }

    @Override
    public void onUserNameError() {
        if (loginView!=null)
            loginView.setUsernameError();

    }

    @Override
    public void onPasswordError() {
        if (loginView!=null)
            loginView.setPasswordError();
    }
}
