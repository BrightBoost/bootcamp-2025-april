package week3;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        booksMiniExercise();
    }

    public static void booksMiniExercise() {
        // create a list
        List<Book> books = new ArrayList<>();

        Book b1 = new Book("blabla1", "Maaike");
        // add three books
        books.add(b1);
        books.add(new Book("blabla2", "Maaike"));
        books.add(new Book("blabla3", "Maaike"));

        // print the books
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle());
        }
        System.out.println("----------");
        // remove the last one
        books.removeLast();

        // add a new one
        books.add(new Book("blablabla4", "Imke"));

        // print them again
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle() + " - " + books.get(i).getAuthor());
        }
    }
}
