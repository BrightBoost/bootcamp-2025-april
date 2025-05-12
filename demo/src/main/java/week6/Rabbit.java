package week6;

public class Rabbit extends Animal {
    // default access, if we don't have a modifier (e.g. private or public)
    // default access means it's only accessible inside the package
    // sometimes default access is called "package private"
//    void hide() {
//        System.out.println(getName() + " is hiding...");
//    }

    protected void hide() {
        System.out.println(getName() + " is hiding...");
    }
}
