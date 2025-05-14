package week6.abstractexplained;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("dog is eating");
    }

    @Override
    public boolean breathe() {
        System.out.println("dog is eating");
        return true;
    }
}
