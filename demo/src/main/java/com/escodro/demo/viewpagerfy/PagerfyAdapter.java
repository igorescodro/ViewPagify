package com.escodro.demo.viewpagerfy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by IgorEscodro on 3/11/2016.
 */
public class PagerfyAdapter extends FragmentStatePagerAdapter {

    public PagerfyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        final Bundle bundle = new Bundle();
        bundle.putInt(PagerfyFragment.POSITION, position);
        final PagerfyFragment fragment = new PagerfyFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return PagerfyApp.getAlbumDatabase().length;
    }
}
