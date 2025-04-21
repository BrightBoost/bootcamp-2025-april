package week2.oop1;

public class Cat {
    String color;
    int avgHoursOfSleepPerDay;
    String name;

    public void meow() {
        System.out.println(name + ": meow meow, I've slept " + avgHoursOfSleepPerDay + " hours today.");
    }
}
