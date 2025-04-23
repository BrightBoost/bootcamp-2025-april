package week3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatesExplained {
    public static void main(String[] args) {
        // how to create a date for now
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // how to create a date with a specific time
        LocalDate ld2 = LocalDate.of(2022, 1, 3);
        System.out.println(ld2);

        LocalDateTime ldt2 = LocalDateTime.of(2026, 4, 23, 19, 10);
        System.out.println(ldt2);

        // basic math with dates
        LocalDate ld3 = ld2.plusWeeks(3);
        System.out.println(ld3);
        System.out.println(ld2);

        LocalDateTime ldt3 = ldt2.plusHours(100);
        System.out.println(ldt3);

        // comparing two dates
        if(ld2.isBefore(ld3)) {
            System.out.println("ld2 is before ld3");
        }
        if(ld2.isAfter(ld3)) {
            System.out.println("ld2 is after ld3");
        }

        // formatting dates
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(ld3.format(dtf));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy KK:mma");//a shows AM or PM
        System.out.println(ldt.minusHours(12).format(dtf2));

        // parsing
        String stringDate = "23-Apr-2025";
        LocalDate ld4 = LocalDate.parse(stringDate, dtf);
        System.out.println(ld4);
        System.out.println(ld4.format(dtf));

    }
}
