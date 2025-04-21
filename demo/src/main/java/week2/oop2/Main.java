package week2.oop2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(5);
        System.out.println(cat.getAge());
        cat.setAge(-6);
        int catAge = cat.getAge();
        System.out.println(catAge);

        Cat cat2 = new Cat(1, "Zia", 3, 7);
        System.out.println(cat2.getName() + " is " + cat2.getAge() +  " years old. And weighs " + cat2.getWeight() + " kilos. And has this many lives left: " + cat2.getLivesLeft());

        cat2.meow();
        cat2.meow("mewoooooowwoowweeew");
    }
}
