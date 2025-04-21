package week2.oop3exercise;

public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alex");
        p.setAge(-5);
        p.setFavoriteColor(null);

        System.out.println(p.getName() + " is " + p.getAge() + " years old and loves " + p.getFavoriteColor());

        Book book = new  Book();
        book.setAuthor("some author");
        book.setTitle("blbla");
        book.setYearOfPublication(1900);

        System.out.println(book.getAuthor() + " wrote " + book.getTitle() + " in the year " + book.getYearOfPublication());

        book.setYearOfPublication(1600);

        System.out.println(book.getAuthor() + " wrote " + book.getTitle() + " in the year " + book.getYearOfPublication());

        book.setYearOfPublication(-1000);

        System.out.println(book.getAuthor() + " wrote " + book.getTitle() + " in the year " + book.getYearOfPublication());

    }
}
