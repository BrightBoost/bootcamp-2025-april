package week3;

import java.util.ArrayList;
import java.util.List;

public class ListsExplained {
    public static void main(String[] args) {
        String[] names = new String[20];
        names[0] = "Faith";
        names[1] = "Ridwan";

        // disadvantages arrays: manual index management + fixed length

        List<String> names2 = new ArrayList<>();
        names2.add("Rosario");
        names2.add("Isaac");
        names2.add("Wilmer");

        System.out.println(names2.indexOf("Isaac"));
        System.out.println(names2.size());
        System.out.println(names2.get(1));



    }
}
