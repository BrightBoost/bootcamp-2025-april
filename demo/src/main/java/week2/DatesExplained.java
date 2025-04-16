package week2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatesExplained {
    public static void main(String[] args) {
        String s = "Some text";
        int x = 5;
        Scanner scanner = new Scanner(System.in);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        int dayMonth = today.getDayOfMonth();
        System.out.println(dayMonth);

        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println(nextWeek);

        LocalDate someDay = LocalDate.of(2025, 1, 31);
        System.out.println(someDay.plusMonths(1).plusMonths(1));

        String date = "2025-09-01";
        LocalDate parsedDate = LocalDate.parse(date);
        System.out.println(parsedDate);

        // Custom date time formatters
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yy");

        System.out.println(parsedDate.format(dtf));

    }

}
