import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class DateCheckerTest 
{

    DateChecker checker = new DateChecker();

    @Test
    public void januaryHas31Days() 
    {
        assertTrue(checker.has31Days(DateChecker.Month.JANUARY),
                   "January should have 31 days");
    }

    @Test
    public void aprilDoesNotHave31Days() 
    {
        assertFalse(checker.has31Days(DateChecker.Month.APRIL),
                    "April should not have 31 days");
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class,
                names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"})
    public void monthsWith31Days(DateChecker.Month month) 
    {
        assertTrue(checker.has31Days(month), month + " should have 31 days");
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class,
                names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void monthsWith30Days(DateChecker.Month month) 
    {
        assertFalse(checker.has31Days(month), month + " should not have 31 days");
    }

    @Test
    public void februaryDoesNotHave31Days() 
    {
        assertFalse(checker.has31Days(DateChecker.Month.FEBRUARY),
            "February should not have 31 days");
    }

    @Test
    public void nullMonthThrowsException()
    {
        assertThrows(IllegalArgumentException.class, () -> checker.has31Days(null));
    }
}