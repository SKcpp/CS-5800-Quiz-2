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
    public void testSubtract() 
    {
        int expected = 2;
        int actual = calc.subtract(5, 3);
        assertEquals(expected, actual);
    }
}