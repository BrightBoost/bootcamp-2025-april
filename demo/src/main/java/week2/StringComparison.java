package week2;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Maaike";
        String s2 = new String("Maaike");

        System.out.println(s1 + s2);

        // looking at the memory location
        if(s1 == s2) {
            System.out.println("They're the same");
        } else {
            System.out.println("They're not the same");
        }

        // looking at the value of the text
        if(s1.equals(s2)) {
            System.out.println("They're the same");
        } else {
            System.out.println("They're not the same");
        }
    }
}
