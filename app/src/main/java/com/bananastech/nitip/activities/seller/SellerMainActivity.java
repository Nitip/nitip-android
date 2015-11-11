package com.bananastech.nitip.activities.seller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.bananastech.nitip.R;
import com.bananastech.nitip.holders.TripViewHolder;
import com.bananastech.nitip.models.TripModel;
import com.skocken.efficientadapter.lib.adapter.EfficientRecyclerAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import android.support.v7.widget.Toolbar;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Rilut
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

        List<TripModel> tripModelList = new ArrayList<TripModel>();
        long now = new Date().getTime();
        tripModelList.add(new TripModel("Jakarta", "Johannesburg", now, now+100000000));
        tripModelList.add(new TripModel("Jakarta", "Singapore", now+200000000, now+1000000000));
        tripModelList.add(new TripModel("Bandung", "Manado", now+1500000000, now+2100000000));
        tripModelList.add(new TripModel("Bandung", "Balikpapan", now+(long) 2400000000.0, now+ (long) 2800000000.0));

        EfficientRecyclerAdapter<TripModel> adapter = new EfficientRecyclerAdapter<TripModel>(R.layout.row_trip, TripViewHolder.class, tripModelList);
        recyclerViewTrips.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewTrips.setAdapter(adapter);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My Trip List");
    }
}
