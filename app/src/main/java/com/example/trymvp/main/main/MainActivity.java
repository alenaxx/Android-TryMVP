package com.example.trymvp.main.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.trymvp.R;
import com.example.trymvp.databinding.ActivityMainBinding;

/**
 * Displays the Main screen
 */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mPresenter = new MainPresenter(this);
        binding.setPresenter(mPresenter);

    }

    //// MVPVIEW METHODS /////
    @Override
    public void showSignInScreen() {
        Toast.makeText(this,"Taking user to the Sign in screen",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this,"Taking user to the Sign up screen",Toast.LENGTH_SHORT).show();

    }
}
