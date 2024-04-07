package enumPuck.triangle;

public enum TriangleType {
    EQUILATERAL("equ") , ISOSCELES("iso") , RIGHTANGLE("ra") , SCALENE("sca") ,INVALID("inv");

    private final String desc;


    TriangleType(String desc) {
        this.desc = desc;
    }
}
