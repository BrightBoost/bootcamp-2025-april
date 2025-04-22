## ✅ **1. Divide two numbers with exception handling**

### 🧠 What they’ll learn:
- How to catch a divide-by-zero error (`ArithmeticException`)
- Try-catch basics

### 📝 Steps:
1. Ask the user for two `int` values using `Scanner`.
2. Try to divide the first number by the second.
3. Catch `ArithmeticException` and display a friendly message.

### 💡 Example:
```java
import java.util.Scanner;

public class DivideExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Oops! You can't divide by zero.");
        }
    }
}
```

---

## ✅ **2. String to int conversion**

### 🧠 What they’ll learn:
- Use of `Integer.parseInt()`
- Catching `NumberFormatException`

### 📝 Steps:
1. Ask the user for a number in **string** form.
2. Try to convert it to an `int`.
3. Catch `NumberFormatException` if it’s not a valid number.

### 💡 Example:
```java
import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (as text):");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("That's not a valid number.");
        }
    }
}
```

---

## ✅ **3. Get age input (loop until valid)**

### 🧠 What they’ll learn:
- Repeating input until valid using a loop
- Combining `try-catch` with loops

### 📝 Steps:
1. Loop while the input is invalid.
2. Use `scanner.nextInt()` in a `try` block.
3. Catch `InputMismatchException` and retry.

### 💡 Example:
```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int age = 0;

        while (!valid) {
            try {
                System.out.println("Enter your age:");
                age = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("That doesn't seem to be a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        System.out.println("Your age is: " + age);
    }
}
```

---

## ✅ **4. Guess the number game with exception handling**

### 🧠 What they’ll learn:
- `while` loops with conditions
- Catching bad input during a guessing game

### 📝 Steps:
1. Set a secret number (e.g., 7).
2. Use a loop to keep asking until the guess is correct.
3. Catch `InputMismatchException`.

### 💡 Example:
```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = 7;
        boolean guessed = false;

        while (!guessed) {
            try {
                System.out.println("Guess the number:");
                int guess = scanner.nextInt();

                if (guess == secret) {
                    System.out.println("Correct!");
                    guessed = true;
                } else {
                    System.out.println("Nope, try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
}
```

---

## ✅ **5. Temperature converter**

### 🧠 What they’ll learn:
- Using `double` input
- Catching invalid number formats

### 📝 Steps:
1. Ask for a temperature in Celsius.
2. Convert it to Fahrenheit.
3. Handle invalid input gracefully.

### 💡 Example:
```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter temperature in Celsius:");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("Fahrenheit: " + fahrenheit);
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a valid temperature.");
        }
    }
}
```

---

## ✅ **6. Even number checker**

### 🧠 What they’ll learn:
- Modulo operator `%`
- Looping until valid input

### 📝 Steps:
1. Ask the user for a number.
2. Check if it's even or odd using `% 2`.
3. Repeat until input is valid.

### 💡 Example:
```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            try {
                System.out.println("Enter a number:");
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println("That's an even number.");
                } else {
                    System.out.println("That's an odd number.");
                }
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Not a valid number.");
                scanner.nextLine();
            }
        }
    }
}
```

---

## ✅ **7. Simple calculator with + - * /**

### 🧠 What they’ll learn:
- Conditional logic with `if` or `switch`
- Catching multiple exception types

### 📝 Steps:
1. Ask for two numbers and an operator (+, -, *, /).
2. Perform the operation.
3. Handle bad input and divide-by-zero.

### 💡 Example:
```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number:");
            int a = scanner.nextInt();
            System.out.println("Enter second number:");
            int b = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline
            System.out.println("Enter operator (+, -, *, /):");
            String op = scanner.nextLine();

            int result = 0;
            if (op.equals("+")) result = a + b;
            else if (op.equals("-")) result = a - b;
            else if (op.equals("*")) result = a * b;
            else if (op.equals("/")) result = a / b;
            else System.out.println("Unknown operator.");

            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid number!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
```

---

## ✅ **8. Read multiple numbers and add them**

### 🧠 What they’ll learn:
- Looping through repeated input
- Skipping only the failed input

### 📝 Steps:
1. Ask the user for 3 valid integers.
2. Add them up.
3. If any input fails, re-ask only for that one.

### 💡 Example:
```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;

        while (count < 3) {
            System.out.println("Enter number " + (count + 1) + ":");
            try {
                int num = scanner.nextInt();
                total += num;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid number. Try again.");
                scanner.nextLine(); // Clear input
            }
        }

        System.out.println("Total sum: " + total);
    }
}
```

---

## ✅ **9. Username input with length check**

### 🧠 What they’ll learn:
- Input validation with `if` statements
- Throwing their own exception

### 📝 Steps:
1. Ask the user to input a username.
2. If it's shorter than 3 characters, throw an `IllegalArgumentException`.

### 💡 Example:
```java
import java.util.Scanner;

public class UsernameCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scanner.nextLine();

        if (username.length() < 3) {
            throw new IllegalArgumentException("Username too short! Must be at least 3 characters.");
        }

        System.out.println("Welcome, " + username + "!");
    }
}
```

