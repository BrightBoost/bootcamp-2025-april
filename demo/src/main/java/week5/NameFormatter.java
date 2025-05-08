package week5;

public class NameFormatter {
    private NameFormatter() {}

    public static String format(String firstName, String lastName) {
        return "bla1";
    }
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder sb = new StringBuilder();
        if(!prefix.isEmpty()) {
            sb.append(prefix);
            sb.append(" ");
        }
        if(!firstName.isEmpty()) {
            sb.append(firstName);
            sb.append(" ");
        }
        //etc
        return sb.toString();
    }
    public static String format(String fullName) {
        return "bla3";

    }
}
