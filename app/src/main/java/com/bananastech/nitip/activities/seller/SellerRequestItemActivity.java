package com.bananastech.nitip.activities.seller;

import com.bananastech.nitip.R;
import com.bananastech.nitip.fragments.buyer.BuyerCompletedFragment;
import com.bananastech.nitip.fragments.buyer.BuyerFeaturedFragment;
import com.bananastech.nitip.fragments.buyer.BuyerProgressFragment;
import com.bananastech.nitip.fragments.seller.SellerCompletedFragment;
import com.bananastech.nitip.fragments.seller.SellerProgressFragment;
import com.blunderer.materialdesignlibrary.activities.ViewPagerWithTabsActivity;
import com.blunderer.materialdesignlibrary.handlers.ActionBarHandler;
import com.blunderer.materialdesignlibrary.handlers.ViewPagerHandler;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class SellerRequestItemActivity extends ViewPagerWithTabsActivity {
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
        return null;
    }

    @Override
    public ViewPagerHandler getViewPagerHandler() {
        return new ViewPagerHandler(this)
                .addPage(R.string.section_on_progress, new SellerProgressFragment())
                .addPage(R.string.section_completed, new SellerCompletedFragment());
    }

    @Override
    public int defaultViewPagerPageSelectedPosition() {
        return 0;
    }
}
