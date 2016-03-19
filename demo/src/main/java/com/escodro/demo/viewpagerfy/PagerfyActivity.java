package com.escodro.demo.viewpagerfy;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.escodro.viewpagerfy.ViewPagerfy;

/**
 * Demo of {@link AppCompatActivity} implementing {@link ViewPagerfy.OnItemClickedListener} to
 * represents the effect that can be reached with this view.
 * <p/>
 * Created by IgorEscodro on 11/03/2016.
 */
public class PagerfyActivity extends AppCompatActivity implements ViewPagerfy
        .OnItemClickedListener {

    /**
     * Constant to represent the key of field item position in the {@link Bundle}.
     */
    private static final String ARGS_POSITION = "position";

    /**
     * Field to represent the current item position of {@link ViewPagerfy}.
     */
    private int mPosition;

    /**
     * {@link ViewPagerfy} reference.
     */
    private ViewPagerfy mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            mPosition = savedInstanceState.getInt(ARGS_POSITION);
        }

        setContentView(R.layout.activity_viewpagerfy);
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
        mPager = (ViewPagerfy) findViewById(R.id.viewPager);
        final PagerfyAdapter pagerAdapter = new PagerfyAdapter
                (getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);
        mPager.setOnItemClickListener(this);
        mPager.setCurrentItemPosition(mPosition);
    }

    @Override
    public void onItemClick(ViewPager parent, View view, int position) {
        Toast.makeText(this, "Item clicked : " + position, Toast.LENGTH_SHORT).show();
    }
}
