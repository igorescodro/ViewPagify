package com.escodro.demo.viewpagify;

/**
 * Object to represent a album entry in the simulated database.
 * <p/>
 * Created by IgorEscodro on 3/23/2016.
 */
public class Album {

    /**
     * Resource id of the album art.
     */
    private int mResourceId;

    /**
     * Album name.
     */
    private String mAlbumName;

    /**
     * Artist name.
     */
    private String mArtistName;

    /**
     * Create a new instance of {@link Album}.
     *
     * @param resourceId resource id of the album art
     * @param albumName  Album name
     * @param artistName artist name
     */
    public Album(int resourceId, String albumName, String artistName) {
        mResourceId = resourceId;
        mAlbumName = albumName;
        mArtistName = artistName;
    }

    public int getResourceId() {
        return mResourceId;
    }

    public void setResourceId(int mResourceId) {
        this.mResourceId = mResourceId;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public void setAlbumName(String mAlbumName) {
        this.mAlbumName = mAlbumName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public void setArtistName(String mArtistName) {
        this.mArtistName = mArtistName;
    }
}
