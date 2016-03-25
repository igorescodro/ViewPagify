package com.escodro.demo.viewpagify;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.escodro.viewpagify.ViewPagify;

/**
 * Demo od {@link Fragment} representing the items of the {@link ViewPagify}
 * <p/>
 * Created by IgorEscodro on 11/03/2016.
 */
public class PagifyFragment extends Fragment {

    /**
     * Constant to represent the item position in the {@link Bundle}.
     */
    public static final String ARGS_POSITION = "position";

    /**
     * Field to represent the current item position of {@link ViewPagify}.
     */
    private int mPosition;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (getArguments() != null) {
            mPosition = getArguments().getInt(ARGS_POSITION, 0);
        }
        return inflater.inflate(R.layout.fragment_viewpagify, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadAlbumArt(view);
    }

    /**
     * Loads album art from the database to the {@link ImageView} in the fragment.<br> We strongly
     * recommend to use {@link Glide} or another way to handle images when loading it in the {@link
     * ViewPagify}. If the image is simply loaded without any treatment, when the user scrolls the
     * pages, it will freeze your application.<br> In this method we are using {@link Glide} to
     * handle all the recycling, memory and caching.
     *
     * @param view {@link View} with the components
     */
    private void loadAlbumArt(View view) {
        final ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        Glide.with(getActivity()).load(PagifyApp.getAlbumDatabase().get(mPosition).
                getResourceId()).into(imageView);
    }
}
