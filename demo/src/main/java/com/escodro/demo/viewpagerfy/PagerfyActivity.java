package com.escodro.demo.viewpagerfy;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.escodro.viewpagerfy.ViewPagerfy;

/**
 * Created by IgorEscodro on 3/11/2016.
 */
public class PagerfyActivity extends AppCompatActivity implements ViewPagerfy
        .OnItemClickedListener {

    private static final String POSITION = "position";

    private int mPosition;
    private ViewPagerfy mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            mPosition = savedInstanceState.getInt(POSITION);
        }

        setContentView(R.layout.activity_viewpagerfy);
        init();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(POSITION, mPager.getCurrentItemPosition());
    }

    private void init() {
        mPager = (ViewPagerfy) findViewById(R.id.viewPager);
        final PagerfyAdapter pagerAdapter = new PagerfyAdapter
                (getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);
        mPager.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(ViewPager parent, View view, int position) {
        Toast.makeText(this, "Item clicked = " + position, Toast.LENGTH_SHORT).show();
    }
}
