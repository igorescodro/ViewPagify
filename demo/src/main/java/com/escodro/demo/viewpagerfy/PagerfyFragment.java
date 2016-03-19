package com.escodro.demo.viewpagerfy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.escodro.viewpagerfy.ViewPagerfy;

/**
 * Demo od {@link Fragment} representing the items of the {@link ViewPagerfy}
 * <p/>
 * Created by IgorEscodro on 11/03/2016.
 */
public class PagerfyFragment extends Fragment {

    /**
     * Constant to represent the item position in the {@link Bundle}.
     */
    public static final String ARGS_POSITION = "position";

    /**
     * Field to represent the current item position of {@link ViewPagerfy}.
     */
    private int mPosition;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (getArguments() != null) {
            mPosition = getArguments().getInt(ARGS_POSITION, 0);
        }
        return inflater.inflate(R.layout.fragment_viewpagerfy, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initComponents(view);
    }

    /**
     * Initialize the components.
     *
     * @param view {@link View} with the components
     */
    private void initComponents(View view) {
        final ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(PagerfyApp.getAlbumDatabase()[mPosition]);
    }
}
