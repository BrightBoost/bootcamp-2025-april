package week1;

public class IfElseExplained {
    public static void main(String[] args) {
//        if x == 5:
//          print(x)
        int x = 4;
        if (x < 5) {
            System.out.println("x is smaller than 5");
        } else if (x > 10) {
            System.out.println("x is bigger than 10");
        } else {
            System.out.println("x is not smaller than 5 and not bigger than 10");
        }


        if (x % 2 == 0) {
            System.out.println("x is an even number");
        } else {
            System.out.println("x is an odd number");
        }
    }
}
