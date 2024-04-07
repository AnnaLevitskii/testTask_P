import enumPuck.days.Days;
import enumPuck.days.DaysWeek;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DaysTests {
    @Test
    public void daysTest_positive(){
        Days days = new Days();
        Assert.assertEquals(days.daysWeek(DaysWeek.FRIDAY), "day off");
        Assert.assertEquals(days.daysWeek(DaysWeek.MONDAY), "working day");
    }
    @Test(expectedExceptions = NullPointerException.class)
    public void daysTest_negative(){
        Days days = new Days();
        Assert.assertEquals(days.daysWeek(null), null);
    }
}
