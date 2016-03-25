package com.escodro.demo.viewpagify;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo of {@link Application} class.
 * <p/>
 * Created by IgorEscodro on 11/03/2016.
 */
public class PagifyApp extends Application {

    /**
     * A static array to simulate a database.
     */
    private static List<Album> mDatabase;

    /**
     * Get the album database.
     *
     * @return album database
     */
    public static List<Album> getAlbumDatabase() {
        if (mDatabase == null) {
            mDatabase = new ArrayList<>();
            mDatabase.add(new Album(R.drawable.lonerism, "Lonerism", "Tame Impala"));
            mDatabase.add(new Album(R.drawable.art_angels, "Art Angels", "Grimes"));
            mDatabase.add(new Album(R.drawable.atlas, "Atlas", "Real Estate"));
            mDatabase.add(new Album(R.drawable.born_to_die, "Born To Die", "Lana del Rey"));
            mDatabase.add(new Album(R.drawable.coeur_de_pirate, "Coeur de Pirate",
                    "Coeur de Pirate"));
            mDatabase.add(new Album(R.drawable.days_of_abandon, "Days of Abandon",
                    "The Pains of Being " +
                            "Pure at Heart"));
            mDatabase.add(new Album(R.drawable.in_colour, "In Colour", "Jamie XX"));
            mDatabase.add(new Album(R.drawable.in_the_mountain, "In the Mountain in the Cloud",
                    "Portugal. The Man"));
            mDatabase.add(new Album(R.drawable.melody, "Melody's Echo Chamber",
                    "Melody's Echo Chamber"));
            mDatabase.add(new Album(R.drawable.royal_blood, "Royal Blood", "Royal Blood"));
            mDatabase.add(new Album(R.drawable.sun_shy, "Sun Shy", "Dresses"));
            mDatabase.add(new Album(R.drawable.the_flower_lane, "The Flower Lane", "Ducktails"));
            mDatabase.add(new Album(R.drawable.the_joshua_tree, "The Joshua Tree", "U2"));
            mDatabase.add(new Album(R.drawable.the_world_wont_listen, "The World Won't Listen",
                    "The Smiths"));
            mDatabase.add(new Album(R.drawable.torches, "Torches", "Foster the People"));
            mDatabase.add(new Album(R.drawable.xy, "X&Y", "Coldplay"));
        }
        return mDatabase;
    }
}
