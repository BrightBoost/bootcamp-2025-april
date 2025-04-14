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
        boolean result = isLongName("Spongebob Squarepants");
        boolean result2 = isLongName("Ryan");
        System.out.println(result + " " + result2);
        System.out.println(isLongName("Spongebob Squarepants") + " " + isLongName("Ryan"));
        String result3 = sayHi();
        System.out.println(toUpperCase("abc"));

        double x1 = getValue();

    }

    // don't need to understand this fully
    public static String toUpperCase(String word) {
        String upper = "";
        for(char c : word.toCharArray()) {
            if(c > 96 && c < 123) {
                upper += (char)(c - 32);
            } else {
                upper += c;
            }
        }
        return upper;
    }

    public static String sayHi() {
        System.out.println("Hi.");
        return "Hi";
    }

    public static void sayHiName(String name) {
        System.out.println("Hi " + name);
    }

    public static void sayHiNameAndAge(String name, int age) {
        System.out.println("Hi " + name + ", You are " + age + " years old.");
    }

    public static boolean isLongName(String name) {
        if(name.length() > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static int lengthFirstAndLastName(String firstName, String lastName) {
        int lengthFirstName = firstName.length();
        int lengthLastName = lastName.length();
        int totalLength = lengthFirstName + lengthLastName;
        return totalLength;
    }

    public static double getValue() {
        if(Math.random() > 0.5) {
            return 6.7;
        } else {
            return 4.9;
        }
    }
}
