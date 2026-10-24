import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest
{
    private final Calculator calc = new Calculator();

    @Test
    public void testSum() 
    {
        int expected = 5;
        int actual = calc.sum(2, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithNegative() 
    {
        int expected = -1;
        int actual = calc.sum(2, -3);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithZero() 
    {
        int expected = 7;
        int actual = calc.sum(7, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() 
    {
        int expected = 2;
        int actual = calc.subtract(5, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractResultingInNegative() 
    {
        int expected = -4;
        int actual = calc.subtract(3, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() 
    {
        int expected = 12;
        int actual = calc.multiply(4, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyWithNegative() 
    {
        int expected = -12;
        int actual = calc.multiply(-4, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyWithZero() 
    {
        int expected = 0;
        int actual = calc.multiply(9, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() 
    {
        int expected = 4;
        int actual = calc.divide(12, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() 
    {
        ArithmeticException ex =
                assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
        assertEquals("Cannot divide by zero", ex.getMessage());
    }

    @Test
    public void isEvenReturnsTrueForEvenNumbers() 
    {
       boolean actual = calc.isEven(4);
        assertTrue(actual);
    }

    @Test
    public void isEvenReturnsFalseForOddNumbers() 
    {
       boolean actual = calc.isEven(7);
        assertFalse(actual);
    }

}