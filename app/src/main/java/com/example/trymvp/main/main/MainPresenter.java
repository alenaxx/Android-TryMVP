package com.example.trymvp.main.main;

import android.view.View;

import com.example.trymvp.main.main.MainContract;

/**
 * Responsible for handling actions from the View and updating UI as requaried
 */
public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view){

        mView = view;
    }

    //////    PRESENTER METHODS /////
    @Override
    public void handleSignInButtonClick(View view) {
             mView.showSignInScreen();

    }

    @Override
    public void handleSignUpButtonClick(View view) {
            mView.showSignUpScreen();

    }
}
