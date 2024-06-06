package at.fhj.msd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-2, calculator.add(-3, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtraction() {
        assertEquals(3, calculator.minus(8, 5));
        assertEquals(-4, calculator.minus(-3, 1));
        assertEquals(0, calculator.minus(0, 0));
    }

    @Test
    public void testMultiplication() {
        assertEquals(40, calculator.multiply(8, 5));
        assertEquals(0, calculator.multiply(4, 0));
        assertEquals(-3, calculator.multiply(-3, 1));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(8, 4));
        assertEquals(-3, calculator.divide(-3, 1));
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(8, 0);
            });
        }
    }

