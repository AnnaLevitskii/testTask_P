package enumPuck.triangle;

public class Triangle {
    public static TriangleType getTriangleType(int a, int b, int c){
        if(a<=0 || b<=0 || c<=0) return TriangleType.INVALID;
        if(a+b+c!=180) return TriangleType.INVALID;
        if(a==b && b==c) return TriangleType.EQUILATERAL;
        if(a==b || b==c || a==c) return TriangleType.ISOSCELES;
        if(a==90 || b==90 || c==90) return TriangleType.RIGHTANGLE;
        else return TriangleType.SCALENE;
    }
}
