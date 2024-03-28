import org.testng.Assert;
import org.testng.annotations.Test;

public class Tasks {
    public static double average(int...nums){
        int sum = 0; //sum should be double + check on length 0
        for(int num:nums){
            sum+=num;
        }
        return sum/nums.length;
    }

    @Test
    public void averageTest(){
        Assert.assertEquals(average(1,2,3), 2);
        //Assert.assertEquals(average(), 0);
        //Assert.assertEquals(average(2147483647, 2147483647, 2147483647, 2147483647 ), 2147483647);
        //Assert.assertEquals(average(2147483647, 1 ), 2147483647);
        Assert.assertEquals(average(2147483647 ), 2147483647);
        Assert.assertEquals(average(-2147483647 ), -2147483647);
        Assert.assertEquals(average(-2147483647 , -2147483647 ), -2147483647);
    }
}
