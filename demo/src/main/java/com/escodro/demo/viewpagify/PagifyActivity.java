package com.escodro.demo.viewpagify;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.escodro.viewpagify.ViewPagify;

/**
 * Demo of {@link AppCompatActivity} implementing {@link ViewPagify.OnItemClickedListener} to
 * represents the effect that can be reached with this view.
 * <p/>
 * Created by IgorEscodro on 11/03/2016.
 */
public class PagifyActivity extends AppCompatActivity implements ViewPagify
        .OnItemClickedListener {

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
        mPager.setCurrentItemPosition(mPosition);
    }

    @Override
    public void onItemClick(ViewPager parent, View view, int position) {
        Toast.makeText(this, "Item clicked : " + position, Toast.LENGTH_SHORT).show();
    }
}
