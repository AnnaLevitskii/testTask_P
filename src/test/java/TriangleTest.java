import enumPuck.triangle.Triangle;
import enumPuck.triangle.TriangleType;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TriangleTest {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void triangleTest_positive(){
        softAssert.assertEquals(Triangle.getTriangleType(90, 50, 40), TriangleType.RIGHTANGLE);
        softAssert.assertEquals(Triangle.getTriangleType(60, 60, 60), TriangleType.EQUILATERAL);
        softAssert.assertEquals(Triangle.getTriangleType(120, 30, 30), TriangleType.ISOSCELES);
        softAssert.assertEquals(Triangle.getTriangleType(80, 60, 40), TriangleType.SCALENE);
        softAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        softAssert.assertAll("triangleTest_positive");
    }
    @Test
    public void triangleTest_negative(){
        softAssert.assertEquals(Triangle.getTriangleType(90, 50, 20), TriangleType.INVALID);
        softAssert.assertEquals(Triangle.getTriangleType(80, 50, 51), TriangleType.INVALID);
        softAssert.assertEquals(Triangle.getTriangleType(80, 50, 49), TriangleType.INVALID);
        softAssert.assertEquals(Triangle.getTriangleType(-1, 60, 60), TriangleType.INVALID);
        softAssert.assertEquals(Triangle.getTriangleType(-1, 100, 81), TriangleType.INVALID);
        softAssert.assertEquals(Triangle.getTriangleType(0, 30, 30), TriangleType.INVALID);
        softAssert.assertEquals(Triangle.getTriangleType(0, 100, 80), TriangleType.INVALID);
        softAssert.assertAll("triangleTest_negative");
    }
}
