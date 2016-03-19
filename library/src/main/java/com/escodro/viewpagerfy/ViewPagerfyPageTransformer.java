package com.escodro.viewpagerfy;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Base transformer to be used with {@link ViewPagerfy}.
 * <p/>
 * Created by IgorEscodro on 14/03/2016.
 */
public abstract class ViewPagerfyPageTransformer implements ViewPager.PageTransformer {

    /**
     * Width padding reference.
     */
    private int mWidthPadding;

    /**
     * Sets the width padding;
     *
     * @param padding padding to be set
     */
    public void setPadding(int padding) {
        mWidthPadding = padding;
    }

    /**
     * {@inheritDoc}<p/> <b>Override</b><br> A margin is calculated in the method because once there
     * is extra padding to show more than one item at the same time, the parameter <i>position</i>
     * is not correct. Then this margin is subtracted from the <i>position</i> and the animation
     * works seamlessly.
     */
    @Override
    public void transformPage(View view, float position) {
        final int viewWidth = view.getWidth();
        final float margin = (float) mWidthPadding / viewWidth;
        position -= margin;
        transform(view, position);
    }

    /**
     * Apply a property transformation to the given page.
     *
     * @param view     {@link View} to receive the transformation
     * @param position Position of page relative to the current front-and-center position of the
     *                 pager.
     */
    public abstract void transform(View view, float position);
}
