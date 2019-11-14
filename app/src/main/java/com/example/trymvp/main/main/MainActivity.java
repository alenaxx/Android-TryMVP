package com.example.trymvp.main.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.trymvp.R;

/**
 * Displays the Main screen
 */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
    }
}
