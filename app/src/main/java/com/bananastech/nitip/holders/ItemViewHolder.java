package com.bananastech.nitip.holders;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.bananastech.nitip.R;
import com.bananastech.nitip.models.ItemModel;
import com.skocken.efficientadapter.lib.viewholder.EfficientViewHolder;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class ItemViewHolder extends EfficientViewHolder<ItemModel> {

    public ItemViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    protected void updateView(Context context, ItemModel object) {
        TextView tvName = findViewByIdEfficient(R.id.row_featured_item_tv_name);
        tvName.setText(object.getName());
    }
}
