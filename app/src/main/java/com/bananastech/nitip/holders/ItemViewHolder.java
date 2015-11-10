package com.bananastech.nitip.holders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

import com.bananastech.nitip.R;
import com.bananastech.nitip.activities.buyer.BuyerDetailItemActivity;
import com.bananastech.nitip.models.ItemModel;
import com.skocken.efficientadapter.lib.viewholder.EfficientViewHolder;

import java.text.DecimalFormat;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class ItemViewHolder extends EfficientViewHolder<ItemModel> {

    public ItemViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    protected void updateView(final Context context, ItemModel object) {
        TextView tvName = findViewByIdEfficient(R.id.row_featured_item_tv_name);
        TextView tvPrice = findViewByIdEfficient(R.id.row_featured_item_tv_price);
        AppCompatButton btnView = findViewByIdEfficient(R.id.row_featured_item_btn_view);
        tvName.setText(object.getName());
        DecimalFormat df = new DecimalFormat("#.###");
        String price = df.format(object.getPrice());
        tvPrice.setText("Rp. " + price);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BuyerDetailItemActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
