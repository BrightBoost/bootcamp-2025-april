package week6.abstractexplained;

public class App {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.breathe();
        if(animal.breathe()) {
            System.out.println("woohoo it's alive");
        }
    }
}
