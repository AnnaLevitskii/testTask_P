import enumPuck.triangle.Triangle;
import enumPuck.triangle.TriangleType;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import riskAssessmentLib0.RiskSoftAssert;
import riskAssessmentLib0.SeverityType;

import java.io.IOException;

public class TriangleTest {
    RiskSoftAssert riskSoftAssert = new RiskSoftAssert();
    @Test
    public void triangleTest_positive(){
        riskSoftAssert.assertEquals(Triangle.getTriangleType(90, 50, 40), TriangleType.RIGHTANGLE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(60, 60, 60), TriangleType.EQUILATERAL);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(120, 30, 30), TriangleType.ISOSCELES);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(80, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(180, 60, 40), TriangleType.SCALENE);
        riskSoftAssert.assertRisk("positive triangleTest fail", SeverityType.CRITICAL);
        riskSoftAssert.assertAll("triangleTest_positive3");
    }
    @Test
    public void triangleTest_negative(){
        riskSoftAssert.assertEquals(Triangle.getTriangleType(90, 50, 20), TriangleType.INVALID);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(80, 50, 51), TriangleType.INVALID);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(80, 50, 49), TriangleType.INVALID);
        riskSoftAssert.assertRisk("negativeTriangleTest_likely values", SeverityType.MAJOR);

        riskSoftAssert.assertEquals(Triangle.getTriangleType(-1, 60, 60), TriangleType.INVALID);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(0, 30, 30), TriangleType.INVALID);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(0, 100, 80), TriangleType.INVALID);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(-1, 100, 81), TriangleType.INVALID);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(120, 30, 30), TriangleType.INVALID);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(120, 30, 30), TriangleType.INVALID);
        riskSoftAssert.assertEquals(Triangle.getTriangleType(120, 30, 30), TriangleType.INVALID);
        riskSoftAssert.assertRisk("negativeTriangleTest_unlikely values", SeverityType.MINOR);

        riskSoftAssert.assertAll("triangleTest_negative");
    }

}
