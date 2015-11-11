package com.bananastech.nitip.activities.buyer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.bananastech.nitip.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class BuyerDetailItemActivity extends AppCompatActivity {

    @Bind(R.id.activity_detail_item_buyer_toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item_buyer);
        ButterKnife.bind(this);
        toolbar.setTitle("Item Detail");
    }
}
