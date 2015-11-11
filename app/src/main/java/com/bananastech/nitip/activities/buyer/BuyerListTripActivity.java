package com.bananastech.nitip.activities.buyer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.bananastech.nitip.R;
import com.bananastech.nitip.holders.ItemViewHolder;
import com.bananastech.nitip.holders.TripViewHolder;
import com.bananastech.nitip.models.ItemModel;
import com.bananastech.nitip.models.TripModel;
import com.skocken.efficientadapter.lib.adapter.EfficientRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class BuyerListTripActivity extends AppCompatActivity {

    @Bind(R.id.activity_list_trip_buyer_rv_trips)
    RecyclerView recyclerViewTrips;

    @Bind(R.id.activity_list_trip_buyer_toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_trip_buyer);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        List<TripModel> tripModelList = new ArrayList<TripModel>();
        tripModelList.add(new TripModel("lucguqol", "Bandung", "San Fransisco", 1447430443, 1447603243));
        tripModelList.add(new TripModel("mardhani", "Yogyakarta", "Vienna", 1447430443, 1447603243));
        tripModelList.add(new TripModel("haydarai", "Semarang", "Singapore", 1447430443, 1447603243));
        tripModelList.add(new TripModel("mrluthfianto", "Surabaya", "Bangkok", 1447430443, 1447603243));
        EfficientRecyclerAdapter<TripModel> adapter = new EfficientRecyclerAdapter<TripModel>(R.layout.row_trip, TripViewHolder.class, tripModelList);
        recyclerViewTrips.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewTrips.setAdapter(adapter);
    }
}
