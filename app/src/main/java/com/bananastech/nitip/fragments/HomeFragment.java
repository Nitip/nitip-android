package com.bananastech.nitip.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bananastech.nitip.R;
import com.bananastech.nitip.holders.ItemViewHolder;
import com.bananastech.nitip.models.ItemModel;
import com.skocken.efficientadapter.lib.adapter.EfficientRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Haydar Ali Ismail on 09-Nov-15.
 */
public class HomeFragment extends Fragment {
    @Bind(R.id.fragment_home_rv_featured_items)
    RecyclerView recyclerViewFeaturedItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        List<ItemModel> itemModelList = new ArrayList<ItemModel>();
        itemModelList.add(new ItemModel("test", 2000));
        EfficientRecyclerAdapter<ItemModel> adapter = new EfficientRecyclerAdapter<ItemModel>(R.layout.row_featured_item, ItemViewHolder.class, itemModelList);
        recyclerViewFeaturedItems.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewFeaturedItems.setAdapter(adapter);
        return view;
    }
}
