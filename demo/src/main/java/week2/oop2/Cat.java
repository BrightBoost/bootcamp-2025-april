package week2.oop2;

public class Cat {
    private int age;
    private String name;
    private double weight;
    private int livesLeft;

    public Cat() {
        // this(5, "Muzzy", 5, 9); // constructor chaining - always first call of the constructor
        System.out.println("In the cat constructor");
    }

    public Cat(int age, String name, double weight, int livesLeft) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.livesLeft = livesLeft;
    }

    // overloading = two methods with the same name (or constructors) but different parameters
    public void meow() {
        System.out.println(this.name + " says meow");
    }

    public void meow(String sound) {
        System.out.println(this.name + " says " + sound);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }
}
