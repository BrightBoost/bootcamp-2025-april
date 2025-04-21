package week2.oop2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(5);
        System.out.println(cat.getAge());
        cat.setAge(-6);
        int catAge = cat.getAge();
        System.out.println(catAge);
    }
}
