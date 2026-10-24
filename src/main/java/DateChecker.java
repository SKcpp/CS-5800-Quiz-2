import java.util.EnumSet;
import java.util.Set;

public class DateChecker
{
    public enum Month 
    {
        JANUARY, 
        FEBRUARY, 
        MARCH, 
        APRIL, 
        MAY, 
        JUNE,
        JULY, 
        AUGUST, 
        SEPTEMBER, 
        OCTOBER, 
        NOVEMBER, 
        DECEMBER
    }

    private static final Set<Month> THIRTY_ONE_DAY_MONTHS = EnumSet.of(
            Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY,
            Month.AUGUST, Month.OCTOBER, Month.DECEMBER);

    public boolean has31Days(Month month) 
    {
        return THIRTY_ONE_DAY_MONTHS.contains(month);
    }
}