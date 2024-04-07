import enumPuck.triangle.Triangle;
import enumPuck.triangle.TriangleType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {
    @Test
    public void triangleTest_positive(){
        Assert.assertEquals(Triangle.getTriangleType(90, 50, 40), TriangleType.RIGHTANGLE);
        Assert.assertEquals(Triangle.getTriangleType(60, 60, 60), TriangleType.EQUILATERAL);
        Assert.assertEquals(Triangle.getTriangleType(120, 30, 30), TriangleType.ISOSCELES);
        Assert.assertEquals(Triangle.getTriangleType(80, 60, 40), TriangleType.SCALENE);
    }
    @Test
    public void triangleTest_negative(){
        Assert.assertEquals(Triangle.getTriangleType(90, 50, 20), TriangleType.INVALID);
        Assert.assertEquals(Triangle.getTriangleType(80, 50, 51), TriangleType.INVALID);
        Assert.assertEquals(Triangle.getTriangleType(80, 50, 49), TriangleType.INVALID);
        Assert.assertEquals(Triangle.getTriangleType(-1, 60, 60), TriangleType.INVALID);
        Assert.assertEquals(Triangle.getTriangleType(-1, 100, 81), TriangleType.INVALID);
        Assert.assertEquals(Triangle.getTriangleType(0, 30, 30), TriangleType.INVALID);
        Assert.assertEquals(Triangle.getTriangleType(0, 100, 80), TriangleType.INVALID);
    }
}
