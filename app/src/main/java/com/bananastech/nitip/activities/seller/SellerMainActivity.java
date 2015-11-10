package com.bananastech.nitip.activities.seller;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bananastech.nitip.R;
import com.bananastech.nitip.activities.buyer.BuyerListTripActivity;
import com.bananastech.nitip.holders.ItemViewHolder;
import com.bananastech.nitip.holders.TripViewHolder;
import com.bananastech.nitip.models.TripModel;
import com.skocken.efficientadapter.lib.adapter.EfficientRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Rilut
 */
public class SellerMainActivity extends AppCompatActivity {
    @Bind(R.id.activity_main_seller_rv_trips)
    RecyclerView recyclerViewTrips;

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
        List<TripModel> tripModelList = new ArrayList<TripModel>();
        tripModelList.add(new TripModel("Jakarta", "Johannesburg", 0, 0));
        EfficientRecyclerAdapter<TripModel> adapter = new EfficientRecyclerAdapter<TripModel>(R.layout.row_seller_main, TripViewHolder.class, tripModelList);
        recyclerViewTrips.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewTrips.setAdapter(adapter);
    }
}
