package week2.oop;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Tuco";
        dog1.color = "brown with a little bit of black on its back";
        dog1.breed = "Chihuahua";
        dog1.isGoodBoy = true;
        dog1.weight = 5;

        Dog dog2 = new Dog();
        dog2.name = "Jellybean";
        dog2.color = "Tan reddish color";
        dog2.breed = "Chihuahua";
        dog2.isGoodBoy = true;
        dog2.weight = 11;

        Cat cat1 = new Cat();
        cat1.name = "Figaro";
        cat1.color = "Tuxedo";
        cat1.avgHoursOfSleepPerDay = 16;

        Cat cat2 = new Cat();
        cat2.name = "Pepe";
        cat2.color = "Tuxedo";
        cat2.avgHoursOfSleepPerDay = 10;

        Cat cat3 = new Cat();
        cat3.name = "Kitty";
        cat3.color = "Grey tabby";
        cat3.avgHoursOfSleepPerDay = 16;

        dog1.bark();
        dog2.bark();
        cat1.meow();
        cat2.meow();
        cat3.meow();


    }
}
