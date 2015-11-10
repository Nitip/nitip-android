package com.bananastech.nitip.fragments.seller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bananastech.nitip.R;
import com.bananastech.nitip.holders.ItemViewHolder;
import com.bananastech.nitip.holders.RequestViewHolder;
import com.bananastech.nitip.models.ItemModel;
import com.bananastech.nitip.models.RequestModel;
import com.skocken.efficientadapter.lib.adapter.EfficientRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class SellerProgressFragment extends Fragment {
    @Bind(R.id.fragment_progress_seller_rv_progress)
    RecyclerView recyclerViewProgress;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_progress_seller, container, false);
        ButterKnife.bind(this, view);
        List<RequestModel> requestModelList = new ArrayList<RequestModel>();
        requestModelList.add(new RequestModel("Action Figure Superman", "Action Figure Superman yang memiliki tinggi 5cm.", 100000, 200000, 1));
        EfficientRecyclerAdapter<RequestModel> adapter = new EfficientRecyclerAdapter<RequestModel>(R.layout.row_request, RequestViewHolder.class, requestModelList);
        recyclerViewProgress.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewProgress.setAdapter(adapter);
        return view;
    }
}
