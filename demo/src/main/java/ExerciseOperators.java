public class ExerciseOperators {
    public static void main(String[] args) {
        // 1.  Create 3 variables: an int, a double, and a char. Print them.
        int x = 5;
        double d = 3.4;
        char c = 'Z';
        System.out.println(x + " " + d + " " + c);

        // 2. Add two int variables and print the result.
        int nr1 = 4;
        int nr2 = 5;
        System.out.println(nr1 + nr2);

        // 3. Divide an int by another int and print the result.
        System.out.println(nr1 / nr2);

        // 4. Divide an int by a double and print the result. What data type is the result?
        System.out.println(nr1 / d);
        System.out.println("This is of type.... DOUBLE");

        // 5. Store your age in an int. Calculate and print: "In 10 years I will be: ..."
        int age = 33;
        System.out.println("In 10 years I will be: " + (age + 10));

        // 6. Create a byte with value 100. Add 28 to it and store it in an int. Print it.
        byte b = 100;
        int funkyResult = (byte) (b + 28);

        // 7. Create a double with value 5.7. Cast it to int and print both.
        double val = 5.7;
        int intVal = (int) val;
        System.out.println(val + " - " + intVal);

        // 8. Multiply a float and an int. Store the result in a double. Print it.
        float f = 3.2f;
        int something = 6;
        double result = f * something;
        System.out.printf("The result is %.2f \n", result);

        // 9. Store a char 'A' in a variable. Add 1 to it and print the result. (What happens?)
        char character = 'A';
        System.out.println(character + 1);

        // a bit extra
        char bigB = 'B';
        System.out.println((char)(bigB+ 32));
        char lowK = 'k';
        System.out.println((char)(lowK-32));

        // 10. Create two variables:
        int a = 9;
        int b2 = 2;
        System.out.println(a / b2);
        System.out.println(a % b2);

        // 11. Store your weight in a double. Store your height in a double. Calculate and print BMI:
        double weight = 65;
        double height = 160;
        double bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);

        //  12. Calculate the average of 3 double numbers. Print the result.
        double avg = (weight + height + bmi) / 3;
        System.out.println(avg);

        // 13. BONUS: Expolore the compound assignment operator (`+=`, `*=`, etc.) to modify a variable step by step. Print after each step.
        int x1 = 1;
        x1 += 4; // x1 = x1 + 4
        System.out.println(x1);
        x1 *= 5; // x1 = x1 * 5
        System.out.println(x1);

        // 14. Create a short with value 30000. Multiply it by 2. What happens? Fix it using casting.
        short s = 30000;
        short newShort = (short)(s * 2);
        System.out.println(newShort);

        // 15. Create a variable `double price = 10.99`. Create `int quantity = 5`. Calculate total cost and cast the result to int. Print it.
        double price = 10.99;
        int quantity = 5;
        int totalCost = (int)(price * quantity);
        System.out.println(totalCost);

        // 16. Create an int with value 130. Cast it to byte. Print it. Explain the weirdness.
        int weirdness = 130;
        byte weirdness2 = (byte)weirdness;
        System.out.println(weirdness2);

        // 17. Create a variable `char letter = 'z'`. Subtract 2 from it and print the resulting character.
        char letter = 'z';
        char newLetter = (char) (letter - 2);
        System.out.println(newLetter);

        // 18. Store a long value of 2 billion (2000000000). Add 1 billion to it. Print the result.
        long value = 2000000000L;
        long newValue = value + 1000000000L;
        System.out.println(newValue);

        // 19. Calculate the area of a circle:
        double radius = 4.5;
        double area = Math.PI * radius * radius;
        System.out.println(area);

        // Mini Challenge: Time Calculator (Operators & Casting Only)

        int totalMinutes = 350;
        int fullHours = 350 / 60;
        int remainingMinutes = 350 % 60;
        System.out.printf("That is %d hour(s) and %d minute(s).", fullHours, remainingMinutes);

        double electricityCost = 2.75;
        double totalElectricityCost = electricityCost * fullHours;
        System.out.printf("Cost for %d hour(s) = %.2f euros", fullHours, totalElectricityCost);
    }
}
