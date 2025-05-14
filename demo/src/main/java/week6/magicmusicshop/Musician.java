package week6.magicmusicshop;

import java.util.ArrayList;
import java.util.List;

public class Musician extends Performer<MusicItem> {
    public void playConcert() {
        for(MusicItem mi: getItems()) {
            mi.use();
        }
    }
}
