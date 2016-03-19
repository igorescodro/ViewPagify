package com.escodro.demo.viewpagerfy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.escodro.viewpagerfy.ViewPagerfy;

/**
 * Demo of {@link FragmentStatePagerAdapter} to load some data in the {@link ViewPagerfy}.
 * <p/>
 * Created by IgorEscodro on 11/03/2016.
 */
public class PagerfyAdapter extends FragmentStatePagerAdapter {

    /**
     * Default constructor.
     *
     * @param fm {@link FragmentManager} reference
     */
    public PagerfyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        final Bundle bundle = new Bundle();
        bundle.putInt(PagerfyFragment.ARGS_POSITION, position);
        final PagerfyFragment fragment = new PagerfyFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return PagerfyApp.getAlbumDatabase().length;
    }
}
