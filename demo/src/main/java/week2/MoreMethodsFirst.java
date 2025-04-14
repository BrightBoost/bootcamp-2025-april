package week2;

public class MoreMethodsFirst {
    public static void main(String[] args) {
        double result = add(3.5, 7);
        System.out.println(result);
        System.out.println(add(1.1, 2.2));
        addPrint(2.0, 3.6);
    }

    public static double add(double x, double y) {

        return x + y;
    }

    public static void addPrint(double x, double y) {
        System.out.println(x + y);
    }
}
