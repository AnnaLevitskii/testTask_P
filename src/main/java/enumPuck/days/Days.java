package enumPuck.days;

public class Days {
    public String daysWeek(DaysWeek daysWeek){
        switch (daysWeek){
            case MONDAY, TUESDAY -> {
                return "working day";
            }
            case FRIDAY -> {
                return "day off";
            }
        }
        return null;
    };

}
