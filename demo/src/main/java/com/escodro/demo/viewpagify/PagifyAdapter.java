package com.escodro.demo.viewpagify;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.escodro.viewpagify.ViewPagify;

/**
 * Demo of {@link FragmentStatePagerAdapter} to load some data in the {@link ViewPagify}.
 * <p/>
 * Created by IgorEscodro on 11/03/2016.
 */
public class PagifyAdapter extends FragmentStatePagerAdapter {

    /**
     * Default constructor.
     *
     * @param fm {@link FragmentManager} reference
     */
    public PagifyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        final Bundle bundle = new Bundle();
        bundle.putInt(PagifyFragment.ARGS_POSITION, position);
        final PagifyFragment fragment = new PagifyFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return PagifyApp.getAlbumDatabase().size();
    }
}
