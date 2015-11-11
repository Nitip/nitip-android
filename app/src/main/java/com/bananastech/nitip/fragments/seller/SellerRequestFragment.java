package com.bananastech.nitip.fragments.seller;

import android.os.Bundle;
import android.support.annotation.Nullable;
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
 * Created by Haydar Ali Ismail on 11-Nov-15.
 */
public class SellerRequestFragment extends Fragment {

    @Bind(R.id.fragment_request_seller_rv_requests)
    RecyclerView recyclerViewRequests;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_request_seller, container, false);
        ButterKnife.bind(this, view);
        List<RequestModel> requestModelList = new ArrayList<RequestModel>();
        requestModelList.add(new RequestModel("Action Figure Superman", "Action Figure Superman yang memiliki tinggi 5cm.", 200000, 1));
        EfficientRecyclerAdapter<RequestModel> adapter = new EfficientRecyclerAdapter<RequestModel>(R.layout.row_request, RequestViewHolder.class, requestModelList);
        recyclerViewRequests.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewRequests.setAdapter(adapter);
        return view;
    }
}
