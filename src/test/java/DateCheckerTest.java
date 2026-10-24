import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

}