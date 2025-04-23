## 📅🕒 **Java Time API: 25 Exercises with LocalDate, LocalTime, and LocalDateTime**

---

### 🟢 **Level 1: Getting started with LocalDate and LocalTime**

1. **Print today's date**  
   Create a `LocalDate` for today's date and print it.

2. **Print a specific date**  
   Create a `LocalDate` for 25 December 2025 and print it.

3. **Get parts of a date**  
   Print the year, month, and day of a given `LocalDate`.

4. **Print the current time**  
   Create and print a `LocalTime` for the current time.

5. **Create a specific time**  
   Create a `LocalTime` for 15:30 and print it.

6. **Print parts of a time**  
   Given a `LocalTime`, print the hour and minute separately.

---

### 🟡 **Level 2: LocalDateTime and basic calculations**

7. **Create a `LocalDateTime` from date and time**  
   Combine a `LocalDate` and `LocalTime` to make a `LocalDateTime`.

8. **Print the current date and time**  
   Use `LocalDateTime.now()` and print the result.

9. **Add 1 week to today’s date**  
   Use `.plusWeeks(1)` on `LocalDate` and print the result.

10. **Subtract 3 days from a specific date**  
    Use `.minusDays(3)` on a `LocalDate`.

11. **Add 2 hours and 15 minutes to a `LocalTime`**  
    Use `.plusHours()` and `.plusMinutes()` on a `LocalTime`.

12. **Calculate tomorrow's datetime**  
    Use `LocalDateTime.now()` and add 1 day to it.

---

### 🔵 **Level 3: Parsing and formatting**

13. **Parse a date from a string (yyyy-MM-dd)**  
    Convert a string like `"2025-04-01"` to a `LocalDate`.

14. **Parse a time from a string (HH:mm)**  
    Convert `"09:30"` to a `LocalTime`.

15. **Parse a `LocalDateTime` from a string**  
    Convert `"2025-04-01T09:30"` to a `LocalDateTime`.

16. **Format a date using `DateTimeFormatter`**  
    Format a `LocalDate` to the pattern `"dd MMM yyyy"`. 

17. **Format a time to show hours and minutes**  
    Format a `LocalTime` to `"HH:mm"`.

18. **Format a datetime to a full sentence**  
    Example output: “April 22, 2025 at 9:30 AM” patterns can be found here: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

---

### 🟣 **Level 4: Comparing and calculating time differences**

19. **Check if a date is before or after today**  
    Use `.isBefore()` or `.isAfter()` to compare a `LocalDate`.



---

### 🔴 **Level 5: Applications and mini challenges**

24. **Create a countdown to an event**  
    Ask the user for an event date (as string), parse it, and calculate how many days are left.

25. **Print a schedule of the next 4 weekly meetings**  
    Given a meeting time and day, print the next 4 weekly occurrences using `.plusWeeks()` in a loop.

---

# FOR LATER
20. **Find the number of days between two dates**  
    Use `ChronoUnit.DAYS.between()` or `Period.between()`.

21. **Find the period (years, months, days) between two dates**  
    Create two `LocalDate` values and calculate the period.

22. **Find the duration between two times**  
    Create two `LocalTime` values and calculate the `Duration`.

23. **Calculate your age from a birthday**  
    Parse a birthday string, and use `Period` to calculate the age.