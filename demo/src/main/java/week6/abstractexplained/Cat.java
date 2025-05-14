package week6.abstractexplained;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public boolean breathe() {
        System.out.println("cat is breathing");
        return true;
    }
}
