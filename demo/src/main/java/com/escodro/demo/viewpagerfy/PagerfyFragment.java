package com.escodro.demo.viewpagerfy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by vntiges on 3/11/2016.
 */
public class PagerfyFragment extends Fragment {

    public static final String POSITION = "position";

    private int mPosition;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (getArguments() != null) {
            mPosition = getArguments().getInt(POSITION, 0);
        }
        return inflater.inflate(R.layout.fragment_viewpagerfy, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initComponents(view);
    }

    private void initComponents(View view) {
        final ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(PagerfyApp.getAlbumDatabase()[mPosition]);
    }
}
