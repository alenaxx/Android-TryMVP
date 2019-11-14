package com.example.trymvp.main.main;

import com.example.trymvp.main.main.MainContract;

/**
 * Responsible for handling actions from the View and updating UI as requaried
 */
public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view){

        mView = view;
    }
}
