package com.bananastech.nitip.holders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

import com.bananastech.nitip.R;
import com.bananastech.nitip.activities.buyer.BuyerRequestItemActivity;
import com.bananastech.nitip.activities.seller.SellerRequestItemActivity;
import com.bananastech.nitip.models.TripModel;
import com.skocken.efficientadapter.lib.viewholder.EfficientViewHolder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class TripViewHolder extends EfficientViewHolder<TripModel> {

    public TripViewHolder(View tripView) {
        super(tripView);
    }

    @Override
    protected void updateView(final Context context, TripModel trip) {
        TextView tvName = findViewByIdEfficient(R.id.row_trip_name);
        TextView tvLocationTo = findViewByIdEfficient(R.id.row_trip_location_to);
        TextView tvLocationFrom = findViewByIdEfficient(R.id.row_trip_location_from);
        TextView tvDateFrom = findViewByIdEfficient(R.id.row_trip_from_date);
        TextView tvDateTo = findViewByIdEfficient(R.id.row_trip_to_date);
        AppCompatButton btnView = findViewByIdEfficient(R.id.row_trip_btn_view);
        if (trip.name != null) {
            btnView.setText("Request");
            btnView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, BuyerRequestItemActivity.class);
                    context.startActivity(intent);
                }
            });
        } else {
            btnView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, SellerRequestItemActivity.class);
                    context.startActivity(intent);
                }
            });
        }
        tvName.setText(trip.name);
        tvLocationTo.setText(trip.destination);
        tvLocationFrom.setText(trip.origin);
        Date dateFrom = new Date(trip.getFromDate());
        Date dateTo = new Date(trip.getToDate());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        tvDateFrom.setText(sdf.format(dateFrom));
        tvDateTo.setText(sdf.format(dateTo));
    }
}
