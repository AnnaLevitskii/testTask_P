package enumPuck.days;

public enum DaysWeek {
    MONDAY("mon") ,
    TUESDAY("tue") ,
    WEDNESDAY("wed") ,
    THURSDAY("thu") ,
    FRIDAY("frd") ,
    SATURDAY("sat") ,
    SUNDAY("sun") ;


    private final String add;


    DaysWeek(String add) {
        this.add = add;
    }
}
