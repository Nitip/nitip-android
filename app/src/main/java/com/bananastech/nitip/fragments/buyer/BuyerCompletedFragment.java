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
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class BuyerCompletedFragment extends Fragment {
    @Bind(R.id.fragment_completed_buyer_rv_items)
    RecyclerView recyclerViewItems;
    public void addRequest() {
        Intent intent = new Intent(getContext(), BuyerListTripActivity.class);
        startActivity(intent);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_completed_buyer, container, false);
        ButterKnife.bind(this, view);
        List<ItemModel> itemModelList = new ArrayList<ItemModel>();
        itemModelList.add(new ItemModel("test", 2000));
        EfficientRecyclerAdapter<ItemModel> adapter = new EfficientRecyclerAdapter<ItemModel>(R.layout.row_featured_item, ItemViewHolder.class, itemModelList);
        recyclerViewItems.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewItems.setAdapter(adapter);
        return view;
    }
}
