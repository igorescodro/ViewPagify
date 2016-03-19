package com.escodro.demo.viewpagerfy;

import android.app.Application;

/**
 * Created by vntiges on 3/11/2016.
 */
public class PagerfyApp extends Application {

    private static int[] mDatabase;

    public static int[] getAlbumDatabase() {
        if (mDatabase == null) {
            mDatabase = new int[]{R.drawable.borntodie, R.drawable.ultraviolence, R.drawable
                    .honeymoon, R.drawable.alvvays};
        }
        return mDatabase;
    }
}
