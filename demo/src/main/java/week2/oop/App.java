package week2.oop;

public class App {
    public static void main(String[] args) {
        System.out.println(Chair.latinNameForChair);

        Chair myChair = new Chair();
        myChair.nrOfLegs = 4;
        myChair.color = "black";
        myChair.hasWheels = false;
        myChair.maxWeight = 250;

        Chair c = myChair;
        c.color = "pink";

        System.out.println(myChair.color);

        Chair prestonsChair = new Chair();
        prestonsChair.nrOfLegs = 4;
        prestonsChair.color = "green";
        prestonsChair.hasWheels = false;
        prestonsChair.maxWeight = 0;

        Chair throneOfSparta = new Chair();
        throneOfSparta.nrOfLegs = 4;
        throneOfSparta.color = "solid gold";
        throneOfSparta.maxWeight = 2000;
        throneOfSparta.hasWheels = false;

        myChair.sit();
        prestonsChair.sit();
        throneOfSparta.sit();

    }

}
