package week6.magicmusicshop;

import java.util.ArrayList;
import java.util.List;

public class Magician extends Performer<MagicItem> {

    public void performShow() {
        for(MagicItem mi : getItems()) {
            mi.use();
        }
    }
}
