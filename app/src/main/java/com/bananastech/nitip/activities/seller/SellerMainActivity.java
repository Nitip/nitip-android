package com.bananastech.nitip.activities.seller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.bananastech.nitip.R;
import com.bananastech.nitip.holders.TripViewHolder;
import com.bananastech.nitip.models.TripModel;
import com.skocken.efficientadapter.lib.adapter.EfficientAdapter;
import com.skocken.efficientadapter.lib.adapter.EfficientRecyclerAdapter;
import java.util.ArrayList;
import java.util.List;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Rilut
 */
public class SellerMainActivity extends AppCompatActivity {
    List<TripModel> tripModelList;
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
        tripModelList = new ArrayList<TripModel>();
        tripModelList.add(new TripModel("Jakarta", "Johannesburg", 0, 0));
        EfficientRecyclerAdapter<TripModel> adapter = new EfficientRecyclerAdapter<TripModel>(R.layout.row_seller_main, TripViewHolder.class, tripModelList);
        adapter.setOnItemClickListener(new EfficientAdapter.OnItemClickListener<TripModel>() {
            @Override
            public void onItemClick(EfficientAdapter<TripModel> adapter, View view, TripModel object, int position) {
                Toast.makeText(getApplicationContext(), "Diklik", Toast.LENGTH_SHORT).show();
            }
        });
        recyclerViewTrips.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewTrips.setAdapter(adapter);

        View view = LayoutInflater.from(this).inflate(R.layout.activity_main_seller, null);
        //view.setOnClickListener(new View.OnClickListener() {


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My Trip List");
    }


}
