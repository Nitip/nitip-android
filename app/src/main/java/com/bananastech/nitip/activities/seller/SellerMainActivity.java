package com.bananastech.nitip.activities.seller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.bananastech.nitip.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class SellerMainActivity extends AppCompatActivity {
    @Bind(R.id.activity_main_seller_rv_trips)
    RecyclerView recyclerViewTrips;
    @Bind(R.id.activity_main_seller_toolbar)
    Toolbar toolbar;
    @OnClick(R.id.activity_main_seller_fab_add)
    public void addTrip() {
        Intent intent = new Intent(this, SellerCreateTripActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_seller);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My Trip List");
    }
}
