package com.escodro.demo.viewpagerfy;

import android.app.Application;

/**
 * Demo of {@link Application} class.
 * <p/>
 * Created by IgorEscodro on 11/03/2016.
 */
public class PagerfyApp extends Application {

    /**
     * A static array to simulate a database.
     */
    private static int[] mDatabase;

    /**
     * Get the album database.
     *
     * @return album database
     */
    public static int[] getAlbumDatabase() {
        if (mDatabase == null) {
            mDatabase = new int[]{
                    R.drawable.ride,
                    R.drawable.born_to_die,
                    R.drawable.west_coast,
                    R.drawable.ultraviolence,
                    R.drawable.honeymoon_single,
                    R.drawable.honeymoon};
        }
        return mDatabase;
    }
}
