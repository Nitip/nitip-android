package com.bananastech.nitip.fragments.buyer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bananastech.nitip.R;
import com.bananastech.nitip.activities.buyer.BuyerListTripActivity;
import com.bananastech.nitip.holders.ItemViewHolder;
import com.bananastech.nitip.models.ItemModel;
import com.skocken.efficientadapter.lib.adapter.EfficientRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Haydar Ali Ismail on 09-Nov-15.
 */
public class BuyerFeaturedFragment extends Fragment {
    @Bind(R.id.fragment_featured_buyer_rv_featured_items)
    RecyclerView recyclerViewFeaturedItems;
    @OnClick(R.id.fragment_featured_buyer_fab_add)
    public void addRequest() {
        Intent intent = new Intent(getContext(), BuyerListTripActivity.class);
        startActivity(intent);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_featured_buyer, container, false);
        ButterKnife.bind(this, view);
        List<ItemModel> itemModelList = new ArrayList<ItemModel>();
        itemModelList.add(new ItemModel("Miniatur Eiffel", 200000, "Paris"));
        EfficientRecyclerAdapter<ItemModel> adapter = new EfficientRecyclerAdapter<ItemModel>(R.layout.row_featured_item, ItemViewHolder.class, itemModelList);
        recyclerViewFeaturedItems.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewFeaturedItems.setAdapter(adapter);
        return view;
    }
}
