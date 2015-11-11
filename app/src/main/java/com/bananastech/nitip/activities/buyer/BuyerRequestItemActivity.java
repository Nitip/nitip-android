package com.bananastech.nitip.activities.buyer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.bananastech.nitip.R;
import com.bananastech.nitip.activities.MainActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class BuyerRequestItemActivity extends AppCompatActivity {

    @Bind(R.id.activity_request_item_buyer_toolbar)
    Toolbar toolbar;

    @OnClick(R.id.activity_request_item_buyer_btn_submit)
    public void Submit() {
        Toast.makeText(BuyerRequestItemActivity.this, "We will notify the traveler. When they confirm your request you will be notified", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_item_buyer);
        ButterKnife.bind(this);
        toolbar.setTitle("Request Item");
        setSupportActionBar(toolbar);
    }
}
