package com.bananastech.nitip.activities.buyer;

import android.os.Bundle;

import com.bananastech.nitip.R;
import com.bananastech.nitip.fragments.buyer.BuyerCompletedFragment;
import com.bananastech.nitip.fragments.buyer.BuyerFeaturedFragment;
import com.bananastech.nitip.fragments.buyer.BuyerProgressFragment;
import com.blunderer.materialdesignlibrary.activities.ViewPagerWithTabsActivity;
import com.blunderer.materialdesignlibrary.handlers.ActionBarHandler;
import com.blunderer.materialdesignlibrary.handlers.ActionBarSearchHandler;
import com.blunderer.materialdesignlibrary.handlers.ViewPagerHandler;
import com.blunderer.materialdesignlibrary.listeners.OnSearchListener;

public class BuyerMainActivity extends ViewPagerWithTabsActivity {

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
                .addPage(R.string.section_home, new BuyerFeaturedFragment())
                .addPage(R.string.section_on_progress, new BuyerProgressFragment())
                .addPage(R.string.section_completed, new BuyerCompletedFragment());
    }

    @Override
    public int defaultViewPagerPageSelectedPosition() {
        return 0;
    }
}
