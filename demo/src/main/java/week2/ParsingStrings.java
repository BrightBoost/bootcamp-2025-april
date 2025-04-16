package week2;

public class ParsingStrings {
    public static void main(String[] args) {
        String nr = "5";
//        int nr2 = (int) nr; // not possible, inconvertible types
        int nr2 = Integer.parseInt(nr);
        System.out.println(nr2);
    }
}
