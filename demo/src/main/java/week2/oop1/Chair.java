package week2.oop1;

public class Chair {
    static String latinNameForChair = "sella";
    double maxWeight;
    String color;
    int nrOfLegs;
    boolean hasWheels;

    // sit functionality
    public void sit() {
        System.out.println("sitting on the chair with " + nrOfLegs + " legs. In the color: " + color + " . With wheels?" + hasWheels);

    }
}
