package week7.interfaces;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Document document = new Document("notesWeek7.txt", "interfaces....");
        document.print();

        Printable something = new Image("coffeeMug", "my/desk/coffee.jpg");

        something.print();

        System.out.println("**********");
        List<Printable> printableList = new ArrayList<>();
        printableList.add(document);
        printableList.add(something);

        printList(printableList);
    }

    public static void printList(List<Printable> printables) {
        for(Printable p : printables) {
            p.print();
        }
    }
}
