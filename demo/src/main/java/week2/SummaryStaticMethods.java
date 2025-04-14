package week2;

public class SummaryStaticMethods {
    public static void main(String[] args) {
        printEncouragement();
        printPersonalEncouragement("Preston");
        printPersonalEncouragement("Paulo");
        printPersonalEncouragement("Lex");
        printPersonalEncouragement("Stanislav");
        printPersonalEncouragement("Rosario");
        printPersonalEncouragement("Ridwan");
        printPersonalEncouragement("Samantha");
        printPersonalEncouragement("Ryan");
        printPersonalEncouragement("Rodas");
        printPersonalEncouragement("Linda");
        printPersonalEncouragement("Quincy");

        int result = doubleTheValue(6);
        System.out.println(result);
    }

    public static void printEncouragement() {
        System.out.println("You are doing great!! Keep going!");
    }

    public static void printPersonalEncouragement(String name) {
        System.out.println(name + " you're doing great! Keep going <3");
    }

    public static int doubleTheValue(int x) {
        return x * 3;
    }
}
