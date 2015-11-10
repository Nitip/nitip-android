package com.bananastech.nitip.activities;

import android.content.Intent;
import android.os.Bundle;

import com.bananastech.nitip.R;
import com.bananastech.nitip.fragments.HomeFragment;
import com.bananastech.nitip.fragments.SearchFragment;
import com.bananastech.nitip.fragments.SellFragment;
import com.bananastech.nitip.fragments.TripFragment;
import com.blunderer.materialdesignlibrary.activities.ViewPagerWithTabsActivity;
import com.blunderer.materialdesignlibrary.handlers.ActionBarHandler;
import com.blunderer.materialdesignlibrary.handlers.ActionBarSearchHandler;
import com.blunderer.materialdesignlibrary.handlers.ViewPagerHandler;
import com.blunderer.materialdesignlibrary.listeners.OnSearchListener;

public class MainActivity extends ViewPagerWithTabsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected boolean expandTabs() {
        return true;
    }

    @Override
    protected boolean enableActionBarShadow() {
        return false;
    }

    @Override
    protected ActionBarHandler getActionBarHandler() {
        return new ActionBarSearchHandler(this, new OnSearchListener() {
            @Override
            public void onSearched(String text) {

            }
        });
    }

    @Override
    public ViewPagerHandler getViewPagerHandler() {
        return new ViewPagerHandler(this)
                .addPage(R.string.section_home, new HomeFragment())
                .addPage(R.string.section_trip, new TripFragment())
                .addPage(R.string.section_sell, new SellFragment());
    }

    @Override
    public int defaultViewPagerPageSelectedPosition() {
        return 0;
    }
}
