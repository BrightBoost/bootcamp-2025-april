public class ExerciseMathClass {
    public static void main(String[] args) {
        // 1
        int negativeNr = -45;
        System.out.println(Math.abs(negativeNr));

        // 2
        double y = 3.5;
        double x = 7.8;
        System.out.println(Math.max(y, x));

        // 3
        int nr1 = 99;
        int nr2 = 23;
        System.out.println(Math.min(nr1, nr2));

        // 4
        double d = 8.9;
        System.out.println(Math.floor(d));

        // 5
        double d2 = 5.2;
        System.out.println(Math.ceil(d2));

        // 6
        double d3 = 9.6;
        System.out.println(Math.round(d3));

        // Math random
        double random = Math.random();
        System.out.println(random);

        // what if I want a random nr between 0 and 99
        int randomInt = (int) (Math.random() * 100);

        // 7
        double morningTemp = -3.7;
        double afternoonTemp = 12.4;

        System.out.println(Math.abs(morningTemp - afternoonTemp));
        System.out.println(Math.max(morningTemp, afternoonTemp));
        System.out.println(Math.min(morningTemp, afternoonTemp));
        System.out.println(Math.round(afternoonTemp));
        System.out.println(Math.floor(morningTemp));

        // BONUS

        // 1
        double price = 10.876;
        double roundedNr = (double) Math.round(price * 100) / 100;
        System.out.println(roundedNr);

        // 2
        int seconds = 320;
        int fullMinutes = seconds / 60;
        System.out.println(fullMinutes);

        double fullMinutes2 = seconds / 60.0;
        System.out.println(Math.floor(fullMinutes2));
        System.out.println(Math.ceil(fullMinutes2));

        // 3
        double price1 = 3.64;
        System.out.println("No pennies >:D: " + Math.round(price1 * 20) / 20.0);
        System.out.println("No pennies >:D: " + (float)(Math.round(price1 / 0.05) * 0.05));
        
        // 4
        double xx = 5.9;
        int yy = (int)xx + 3;
        System.out.println(yy);

        int z = (int)(xx + 3);
        System.out.println(z);

        int a = 17;
        int b = 42;
        int c = 9;

        int maxOfValue = Math.max(a, (Math.max(b,c)));
        System.out.println(maxOfValue);

        // 6
        double total = 17.23;
        int pay = (int) Math.ceil(total);
        System.out.println("Pay€: " + pay + " euros");

        // 7
        int x2 = 150;
        byte y2 = (byte)x2;
        System.out.println(y2);

        // 8
        double start = -12.8;
        double end = 7.3;

        double absDistance = Math.abs(start - end);
        System.out.println(absDistance);
        System.out.println(Math.ceil(absDistance));
        System.out.println((int) absDistance);
    }
}
