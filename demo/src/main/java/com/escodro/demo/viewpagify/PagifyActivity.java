package com.escodro.demo.viewpagify;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.escodro.viewpagify.ViewPagify;

/**
 * Demo of {@link AppCompatActivity} implementing {@link ViewPagify.OnItemClickedListener} to
 * represents the effect that can be reached with this view.
 * <p/>
 * Created by IgorEscodro on 11/03/2016.
 */
public class PagifyActivity extends AppCompatActivity implements ViewPagify
        .OnItemClickedListener, ViewPager.OnPageChangeListener {

    /**
     * Constant to represent the key of field item position in the {@link Bundle}.
     */
    private static final String ARGS_POSITION = "position";

    /**
     * Field to represent the current item position of {@link ViewPagify}.
     */
    private int mPosition;

    /**
     * {@link ViewPagify} reference.
     */
    private ViewPagify mPager;

    /**
     * {@link TextView} to hold the album name.
     */
    private TextView mAlbumName;

    /**
     * {@link TextView} to hold the artist name.
     */
    private TextView mArtistName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            mPosition = savedInstanceState.getInt(ARGS_POSITION);
        }

        setContentView(R.layout.activity_viewpagify);
        initComponents();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(ARGS_POSITION, mPager.getCurrentItemPosition());
    }

    /**
     * Initialize the components.
     */
    private void initComponents() {
        mPager = (ViewPagify) findViewById(R.id.viewPager);
        final PagifyAdapter pagerAdapter = new PagifyAdapter
                (getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);
        mPager.setOnItemClickListener(this);
        mPager.addOnPageChangeListener(this);
        mPager.setCurrentItemPosition(mPosition);
        mAlbumName = (TextView) findViewById(R.id.albumName);
        mArtistName = (TextView) findViewById(R.id.artistName);
        loadInfo(mPager.getCurrentItemPosition());
    }

    /**
     * Load the information related to the {@link Album}.
     *
     * @param position {@link Album} position.
     */
    private void loadInfo(int position) {
        final Album album = PagifyApp.getAlbumDatabase().get(position);
        mAlbumName.setText(album.getAlbumName());
        mArtistName.setText(album.getArtistName());
    }

    @Override
    public void onItemClick(ViewPager parent, View view, int position) {
        final Album album = PagifyApp.getAlbumDatabase().get(position);
        Toast.makeText(this, album.getAlbumName() + " by " + album.getArtistName(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        //Do nothing.
    }

    @Override
    public void onPageSelected(int position) {
        loadInfo(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //Do nothing.
    }
}
