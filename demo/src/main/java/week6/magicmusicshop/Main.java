package week6.magicmusicshop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // magician part
        Potion potion = new Potion("invisible drink", 1000);
        Wand wand = new Wand("magic wand", 10);

        Magician magician = new Magician();
        magician.getItems().add(potion);
        magician.getItems().add(wand);

        magician.performShow();

        System.out.println("*********");
        // musician part
        Guitar guitar = new Guitar("wooden guitar", 400);
        DrumKit drumKit = new DrumKit("electric drums", 200);

        Musician musician = new Musician();
        musician.getItems().add(guitar);
        musician.getItems().add(drumKit);

        musician.playConcert();
        System.out.println("*********");

        // shop simulation
        List<Item> items = new ArrayList<>();
        items.add(potion);
        items.add(wand);
        items.add(guitar);
        items.add(drumKit);

        for(Item i: items) {
            i.use();
        }

    }
}
