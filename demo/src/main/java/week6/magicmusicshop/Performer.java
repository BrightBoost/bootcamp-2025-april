package week6.magicmusicshop;

import java.util.ArrayList;
import java.util.List;

// generic performer
// generic because of the T
public abstract class Performer<T extends Item> {
    private List<T> items = new ArrayList<>();

    public List<T> getItems() {
        return items;
    }

    public double getTotalEquipmentValue() {
        double total = 0;
        for(Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
