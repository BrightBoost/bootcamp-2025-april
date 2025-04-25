package week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForeachLoop {
    public static void main(String[] args) {
        List<String> iceCreamFlavors = new ArrayList<>();
        iceCreamFlavors.add("black sesame");
        iceCreamFlavors.add("red bean");
        iceCreamFlavors.add("rocky road");
        iceCreamFlavors.add("chocolate coma");
        iceCreamFlavors.add("mint");
        iceCreamFlavors.add("vanilla");

        for(int i = 0; i < iceCreamFlavors.size(); i++) {
            System.out.println(iceCreamFlavors.get(i));
        }

        System.out.println("****************");
        for(String flavor : iceCreamFlavors) {
            System.out.println(flavor);
        }
        System.out.println("****************");

        Map<String, String> iceCreamAndPeople = new HashMap<>();
        iceCreamAndPeople.put("Stan", "chocolate");
        iceCreamAndPeople.put("Sarah", "mint");
        iceCreamAndPeople.put("Quincy", "rocky road");
        iceCreamAndPeople.put("Wilmer", "red bean");
        iceCreamAndPeople.put("Rodas", "vanilla");
        System.out.println(iceCreamAndPeople.get("Quincy"));

        for(String flavor : iceCreamAndPeople.values()) {
            System.out.println(flavor);
        }
        System.out.println("****************");
        for(String key : iceCreamAndPeople.keySet()) {
            System.out.println(key + " likes " + iceCreamAndPeople.get(key));
        }

        Map<String, Book>  personAndBooks = new HashMap<>();
        personAndBooks.put("bob", new Book("the adventures of alfie", "kabrea"));
        personAndBooks.put("chaima", new Book("girl books", "gaia"));
        personAndBooks.put("aya", new Book("tea time stories", "Josh"));
        System.out.println("****************");

        for(Book book : personAndBooks.values()) {
            System.out.println(book.getTitle());
        }
        System.out.println("****************");
        for(String key : personAndBooks.keySet()) {
            System.out.println(key + " likes " + personAndBooks.get(key).getTitle());
        }

    }
}
