package week1;

public class RecapApril10 {
    public static void main(String[] args) {
        // Literal value types
        int i = 101;
        long j = 192387492837492834L;
        double k = 5.6;
        float l = 4.5F;
        boolean b = true;
        char c = 'g';
        short s = 2;

        String name = "Jonas";

        // wrapper classes for primitives
        Double k2 = 5.6;


        // casting
        int z = (int) k; // casting double to int, cuts end after floating, so 5
        float f = (float) k;
        double result = 8 / (double) z; // dividing integers does integer division

        // operations
        System.out.println(9 + 7);
        System.out.println(9 - 7);
        System.out.println(9 * 7);
        System.out.println(9.0 / 7);
        System.out.println(9 % 7);

        // comparison
        System.out.println(z > 5);
        System.out.println(z < 5);
        System.out.println(z >= 5);
        System.out.println(z == 5); // equal to
        System.out.println(z != 5); // not equal to
        System.out.println(z <= 5);

        // post and pre
        System.out.println(++z); // first increase, then print
        System.out.println(--z); // first decrease, then print
        System.out.println(z++); // fisst print, then increase
        System.out.println(z--); // first print, then decrease

    }
}
