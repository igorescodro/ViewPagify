package com.escodro.viewpagify;

import android.view.View;

/**
 * Custom {@link ViewPagifyPageTransformer} animation shrinks and fades pages when scrolling
 * between adjacent pages. As a page gets closer to the center, it grows back to its normal size and
 * fades in.
 * <p/>
 *
 * @see <a href="http://developer.android.com/intl/en-us/training/animation/screen-slide
 * .html#pagetransformer">Using ViewPager for Screen Slides</a>
 */
public class ZoomOutPageTransformer extends ViewPagifyPageTransformer {

    /**
     * Constant to represent the minimum scale in the animation;
     */
    private static final float MIN_SCALE = 0.5f;

    /**
     * Constant to represent the minimum alpha in the animation;
     */
    private static final float MIN_ALPHA = 0.8f;

    /**
     * {@inheritDoc}
     */
    @Override
    public void transform(View view, float position) {
        final int pageWidth = view.getWidth();
        final int pageHeight = view.getHeight();
        final float alphaFactor = Math.max(MIN_SCALE, 1 - Math.abs(position));
        final float scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position / 10));
        final float verticalMargin = pageHeight * (1 - scaleFactor) / 2;
        final float horizontalMargin = pageWidth * (1 - scaleFactor) / 2;
        if (position < 0) {
            view.setTranslationX(horizontalMargin - verticalMargin);
        } else {
            view.setTranslationX(-horizontalMargin + verticalMargin);
        }
        view.setScaleX(scaleFactor);
        view.setScaleY(scaleFactor);
        view.setAlpha(MIN_ALPHA + (alphaFactor - MIN_SCALE) / (1 - MIN_SCALE) * (1 -
                MIN_ALPHA));
    }
}
