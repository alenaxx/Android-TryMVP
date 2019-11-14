package com.example.trymvp.main.main;

import android.view.View;

/**
 * Definds the contracts between the View {@link MainActivity} and the Presenter
 * {@link MainPresenter}
 */
public interface MainContract {
    interface MvpView{

        void showSignInScreen();
        void showSignUpScreen();

    }
    interface Presenter{

        void handleSignInButtonClick(View view);
        void handleSignUpButtonClick(View view);
    }
}
