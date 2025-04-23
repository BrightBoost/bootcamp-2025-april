import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeApiExercises {
    public static void main(String[] args) {

        // 1. Print today's date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // 2. Print a specific date
        LocalDate christmas = LocalDate.of(2025, 12, 25);
        System.out.println("Christmas 2025: " + christmas);

        // 3. Get parts of a date
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day: " + today.getDayOfMonth());

        // 4. Print the current time
        LocalTime nowTime = LocalTime.now();
        System.out.println("Current time: " + nowTime);

        // 5. Create a specific time
        LocalTime specificTime = LocalTime.of(15, 30);
        System.out.println("Specific time: " + specificTime);

        // 6. Print parts of a time
        System.out.println("Hour: " + specificTime.getHour());
        System.out.println("Minute: " + specificTime.getMinute());

        // 7. Create a LocalDateTime from date and time
        LocalDateTime combined = LocalDateTime.of(today, specificTime);
        System.out.println("Combined datetime: " + combined);

        // 8. Print the current date and time
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("Current datetime: " + nowDateTime);

        // 9. Add 1 week to today’s date
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Next week's date: " + nextWeek);

        // 10. Subtract 3 days from a specific date
        LocalDate earlier = christmas.minusDays(3);
        System.out.println("Three days before Christmas: " + earlier);

        // 11. Add 2 hours and 15 minutes to a LocalTime
        LocalTime updatedTime = specificTime.plusHours(2).plusMinutes(15);
        System.out.println("Time + 2h15m: " + updatedTime);

        // 12. Calculate tomorrow's datetime
        LocalDateTime tomorrow = nowDateTime.plusDays(1);
        System.out.println("Tomorrow's datetime: " + tomorrow);

        // 13. Parse a date from a string (yyyy-MM-dd)
        LocalDate parsedDate = LocalDate.parse("2025-04-01");
        System.out.println("Parsed date: " + parsedDate);

        // 14. Parse a time from a string (HH:mm)
        LocalTime parsedTime = LocalTime.parse("09:30");
        System.out.println("Parsed time: " + parsedTime);

        // 15. Parse a LocalDateTime from a string
        LocalDateTime parsedDateTime = LocalDateTime.parse("2025-04-01T09:30");
        System.out.println("Parsed datetime: " + parsedDateTime);

        // 16. Format a date using DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println("Formatted date: " + parsedDate.format(dateFormatter));

        // 17. Format a time to show hours and minutes
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Formatted time: " + parsedTime.format(timeFormatter));

        // 18. Format a datetime to a full sentence
        DateTimeFormatter fancyFormat = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm a");
        System.out.println("Fancy datetime: " + parsedDateTime.format(fancyFormat));

        // 19. Check if a date is before or after today
        LocalDate futureDate = LocalDate.of(2030, 1, 1);
        System.out.println("Is 2030-01-01 after today? " + futureDate.isAfter(today));
        System.out.println("Is 2020-01-01 before today? " + LocalDate.of(2020, 1, 1).isBefore(today));

        // 24. Create a countdown to an event
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your event date (yyyy-MM-dd): ");
        String eventInput = scanner.nextLine();
        LocalDate eventDate = LocalDate.parse(eventInput);
        long daysLeft = ChronoUnit.DAYS.between(today, eventDate);
        System.out.println("Days until event: " + daysLeft);

        // 25. Print a schedule of the next 4 weekly meetings
        LocalDate meetingDate = LocalDate.now();
        System.out.println("\nYour next 4 weekly meetings:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Meeting " + (i + 1) + ": " + meetingDate);
            meetingDate = meetingDate.plusWeeks(1);
        }
    }
}