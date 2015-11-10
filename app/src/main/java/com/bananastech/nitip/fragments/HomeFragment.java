package com.bananastech.nitip.fragments;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

import com.blunderer.materialdesignlibrary.fragments.ListViewFragment;

/**
 * Created by Haydar Ali Ismail on 09-Nov-15.
 */
public class HomeFragment extends ListViewFragment {
    @Override
    public ListAdapter getListAdapter() {
        return null;
    }

    @Override
    public boolean useCustomContentView() {
        return false;
    }

    @Override
    public int getCustomContentView() {
        return 0;
    }

    @Override
    public boolean pullToRefreshEnabled() {
        return false;
    }

    @Override
    public int[] getPullToRefreshColorResources() {
        return new int[0];
    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
        return false;
    }
}
