package week2;

public class MethodsExplained {
    public static void main(String[] args) {
        sayHi();
        String x = "Isaac";
        sayHiName(x);
        String y = "Stanislav";
        sayHiName(y);
        sayHiName("Wilmer");
        sayHiName("5");
        sayHiNameAndAge("Rosario", 21);
        int forever21 = 21;
        sayHiNameAndAge(y, forever21);
    }

    public static void sayHi() {
        System.out.println("Hi.");
    }

    public static void sayHiName(String name) {
        System.out.println("Hi " + name);
    }

    public static void sayHiNameAndAge(String name, int age) {
        System.out.println("Hi " + name + ", You are " + age + " years old.");
    }
}
