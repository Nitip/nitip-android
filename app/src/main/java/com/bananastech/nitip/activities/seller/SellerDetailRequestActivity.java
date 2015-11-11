package com.bananastech.nitip.activities.seller;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.bananastech.nitip.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Haydar Ali Ismail on 11-Nov-15.
 */
public class SellerDetailRequestActivity extends AppCompatActivity {

    @Bind(R.id.activity_detail_request_seller_toolbar)
    Toolbar toolbar;
    @OnClick(R.id.activity_detail_request_seller_btn_accept)
    public void accept() {
        Toast.makeText(SellerDetailRequestActivity.this, "Thank you, have a nice vacation and don't forget to buy the stuff :)", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 2000);
    }
    @OnClick(R.id.activity_detail_request_seller_btn_reject)
    public void reject() {
        Toast.makeText(SellerDetailRequestActivity.this, "I'm so sorry to hear that you can't help them. Maybe next time :)", Toast.LENGTH_LONG).show();
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
        setContentView(R.layout.activity_detail_request_seller);
        ButterKnife.bind(this);
        toolbar.setTitle("Request Detail");
        setSupportActionBar(toolbar);
    }
}
