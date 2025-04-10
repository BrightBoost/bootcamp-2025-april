public class Operators {
    public static void main(String[] args) {
        // String operations +
        String greeting = "Hi";
        String person = "Samantha";
        System.out.println(greeting + " " + person);
        // with + we concatenate strings

        System.out.println(2 + greeting);
        System.out.println(2 + 3 + greeting);
        System.out.println(greeting + 2 + 3);

        // Math operations
        int nr1 = 3;
        int nr2 = 4;
        // + - / *
        int result = nr1 + nr2;
        System.out.println("+: " + result);

        result = nr1 - nr2;
        System.out.println("-: " + result);

        result = nr1 * nr2;
        System.out.println("*: " + result);

        // weird stuff with dividing ints - integer division
        double doubleResult = (double) nr1 / nr2;
        System.out.println("/: " + doubleResult);

        int nrOfEggs = 143;
        int boxesNeeded = nrOfEggs / 12;
        System.out.println("Boxes I need: " + boxesNeeded);



        float x = 1.0F;
        double y = 2.0;
        // float z = x / y; // not allowed because x over y is a double

        // module % = remainder
        nrOfEggs = 142;
        int boxSize = 12;
        int eggsLeft = nrOfEggs % boxSize;
        System.out.println("eggs left: " + eggsLeft);

        // post and pre ++ -- uni operators
        int i = 4;
        System.out.println(i++); // first send the variable to the printing function and then go ahead and increase
        System.out.println(++i); // first increase, then send to print
        i++; // i = i + 1 // post or pre doesn't matter
        ++i;
        i--; // i = i - 1

        // post or pre is only relevant for other expressions

        // comparison operators < > <= >= for equals we use ==, for not equals !=
        int j = 5;
        int k = 6;
        boolean eval = j != k;
        System.out.println(eval);

        // hurt your brains a little
        System.out.println(j++ == k); // 5 == 6, then increases j to 6
        System.out.println(++j == k); // 7 == 6, first increases j to 7 then compares



    }
}
