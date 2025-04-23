package week3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateExercises {
    public static void main(String[] args) {
        // 11
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = localTime.plusHours(2).plusMinutes(15);
        System.out.println(localTime1);

        // 15
        String date = "2025-04-01T09:30";
        LocalDateTime ldt = LocalDateTime.parse(date);
        System.out.println(ldt);
        

        // 15 extra difficult
        String date1 = "09:30 2025-04-01";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm yyyy-MM-dd");
        LocalDateTime ldt1 = LocalDateTime.parse(date1, dtf);
        System.out.println(ldt1);
    }
}
