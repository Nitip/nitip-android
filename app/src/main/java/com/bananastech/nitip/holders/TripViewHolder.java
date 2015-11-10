package com.bananastech.nitip.holders;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.bananastech.nitip.R;
import com.bananastech.nitip.models.ItemModel;
import com.bananastech.nitip.models.TripModel;
import com.skocken.efficientadapter.lib.viewholder.EfficientViewHolder;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class TripViewHolder extends EfficientViewHolder<TripModel> {

    public TripViewHolder(View tripView) {
        super(tripView);
    }

    @Override
    protected void updateView(Context context, TripModel trip) {
        TextView tvName = findViewByIdEfficient(R.id.row_seller_main_tv_destination);
        tvName.setText(trip.destination);
    }
}
