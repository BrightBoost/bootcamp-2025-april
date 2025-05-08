package week5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void addTwoPositiveNumbersTest() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        double result = calculator.add(3, 4);

        // assert
        assertEquals(7.0, result);
    }

    @Test
    public void addTwoPositiveDecimalNumbersTest() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        double result = calculator.add(3.1, 4.2);

        // assert
        assertEquals(7.3, result, 0.01);
    }
}
