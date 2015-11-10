package com.bananastech.nitip.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bananastech.nitip.R;
import com.bananastech.nitip.activities.buyer.BuyerMainActivity;
import com.bananastech.nitip.activities.seller.SellerMainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.activity_main_btn_buyer)
    public void asBuyer() {
        Intent intent = new Intent(this, BuyerMainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.activity_main_btn_seller)
    public void asSeller() {
        Intent intent = new Intent(this, SellerMainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
