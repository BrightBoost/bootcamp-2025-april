package week5.hotelslowly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        // arrange
        Employee employee = new Employee("abc", "maaike", "it", 30, 40);
        double expectedStartTime = 12;

        // act
        employee.punchIn(12);

        // assert
        assertEquals(expectedStartTime, employee.getStartTime());

    }

    @Test
    void punchOut() {
        // arrange
        Employee employee = new Employee("abc", "maaike", "it", 30, 0);
        double expectedHoursWorked = 12;
        employee.punchIn(10);

        // act
        employee.punchOut(22);

        // assert
        assertEquals(expectedHoursWorked, employee.getHoursWorked());
    }
}