package bridge.Impl;

import bridge.IResource;

public class ArtistResource implements IResource {
    //For artist it use adaptor pattern -> adapt artist to resource interface!
    private Artist artist;
    public ArtistResource(Artist a){
        this.artist = a;
    }


    @Override
    public String snippet() {
        return this.artist.name();
    }

    @Override
    public String image() {
        return this.artist.image();
    }

    @Override
    public String url() {
        return this.artist.url();
    }

    @Override
    public String title() {
        return this.artist.name();
    }
}
