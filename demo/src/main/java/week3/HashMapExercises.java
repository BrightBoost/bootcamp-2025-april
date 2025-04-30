package week3;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class HashMapExercises {
    public static void main(String[] args) {
        getDictionary();
    }

    public static Map<String, String> getDictionary() {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("cat", "kat");
        dictionary.put("discuss", "discussiëren");
        dictionary.put("water", "water");

        System.out.println(dictionary.get("cat"));
        dictionary.put("water", "h20");

        if(dictionary.containsKey("discuss")) {
            System.out.println("discuss is in there");
        }

        for(String key : dictionary.keySet()) {
            System.out.println(key);
        }

        for(String value : dictionary.values()) {
            System.out.println(value);
        }

        return dictionary;
    }
}
