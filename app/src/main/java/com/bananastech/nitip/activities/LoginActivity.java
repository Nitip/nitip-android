package com.bananastech.nitip.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bananastech.nitip.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Haydar Ali Ismail on 09-Nov-15.
 */
public class LoginActivity extends AppCompatActivity {

    @OnClick(R.id.activity_login_btn_login)
    public void login() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.activity_login_tv_register)
    public void register() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
}
