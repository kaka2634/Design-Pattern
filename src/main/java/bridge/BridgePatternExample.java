package bridge;

import bridge.Impl.Artist;
import bridge.Impl.ArtistResource;
import bridge.Impl.LongFormView;

public class BridgePatternExample {
    public static void main(String args[]){
        View view = new LongFormView(new ArtistResource(new Artist()));
        System.out.println(view.show());
    }
}
