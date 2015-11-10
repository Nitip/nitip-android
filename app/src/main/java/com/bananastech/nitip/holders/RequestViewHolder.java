package com.bananastech.nitip.holders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

import com.bananastech.nitip.R;
import com.bananastech.nitip.activities.buyer.BuyerDetailItemActivity;
import com.bananastech.nitip.activities.seller.SellerDetailRequestActivity;
import com.bananastech.nitip.models.RequestModel;
import com.skocken.efficientadapter.lib.viewholder.EfficientViewHolder;

import java.text.DecimalFormat;

/**
 * Created by Haydar Ali Ismail on 11-Nov-15.
 */
public class RequestViewHolder extends EfficientViewHolder<RequestModel> {

    public RequestViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    protected void updateView(final Context context, RequestModel object) {
        TextView tvName = findViewByIdEfficient(R.id.row_request_name);
        TextView tvLowPrice = findViewByIdEfficient(R.id.row_request_low_price);
        TextView tvHighPrice = findViewByIdEfficient(R.id.row_request_high_price);
        TextView tvQuantity = findViewByIdEfficient(R.id.row_featured_item_tv_location);
        AppCompatButton btnView = findViewByIdEfficient(R.id.row_request_btn_view);
        tvName.setText(object.getName());
        DecimalFormat df = new DecimalFormat("#.###");
        String lowPrice = df.format(object.getLowPrice());
        String highPrice = df.format(object.getHighPrice());
        tvLowPrice.setText("Rp. " + lowPrice);
        tvHighPrice.setText("Rp. " + highPrice);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SellerDetailRequestActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
