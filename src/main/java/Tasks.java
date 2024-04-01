import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

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

    public static int countSubString(String string, String subStr) {
        if (string == null || string.isBlank() || subStr == null || subStr.isBlank() || subStr.length() > string.length()) {
            return -1;
        }
        if (!string.contains(subStr)) {
            return 0;
        }
        if (subStr.contains(" ")) subStr.trim();
        int i = 0;
        String[] arr = string.split(" ");
        for (String s : arr) {
            if (s.equals(subStr)) i++;
        }
        return i;
    }

    @Test
    public void countSubStringTest(){
        Assert.assertEquals(countSubString("1234 23 5 32 5 3 5 54 5 323", "5"), 4);
        Assert.assertEquals(countSubString("1234 23 5 32 5 3 5 54 5 323", "0"), 0);
        Assert.assertEquals(countSubString("1234 23 5 32 5 3 5 54 5 323", "23"), 1);
        Assert.assertEquals(countSubString("1234 23 5 32 5 3 5 54 5 323", ""), -1);
        Assert.assertEquals(countSubString("1234 23 5 32 5 3 5 54 5 323", " "), -1);
        Assert.assertEquals(countSubString("1234 23 5 32 5 3 5 54 5 323", " "), -1);
        Assert.assertEquals(countSubString("1234 23 5 32 5 3 5 54 5 323", null), -1);
        Assert.assertEquals(countSubString(null, "12"), -1);
        Assert.assertEquals(countSubString("1234 23 5 32 5 3 5 54 5 323", "null"), 0);
    }

    public static int countEntriesSubString(String string, String subStr){
        if(string==null || string.isBlank() || subStr==null || subStr.isBlank() || subStr.length()>string.length() ){
            return -1;
        }
        if (!string.contains(subStr)) {
            return 0;
        }
        if (subStr.contains(" ")) subStr.trim();
        String[] arr = string.split(subStr);
        if(string.endsWith(subStr))
            return arr.length;
        return arr.length -1;
    }

    @Test
    public void countEntriesSubStringTest(){

        Assert.assertEquals(countEntriesSubString("1234 23 5 32 5 3 5 54 5 323", "5"), 5);
        Assert.assertEquals(countEntriesSubString("1254 23 5 32 5 3 5 54 5 323", "5"), 6);
        Assert.assertEquals(countEntriesSubString("1234 23 5 32 5 3 5 54 5 323", "23"), 3);
        Assert.assertEquals(countEntriesSubString("234 23 5 32 5 3 5 54 5 323", "23"), 3);
        Assert.assertEquals(countEntriesSubString("2323 5 32 5 3 5 54 5 323", "23"), 3);
        Assert.assertEquals(countEntriesSubString("1234 23 5 32 5 3 5 54 5 323", ""), -1);
        Assert.assertEquals(countEntriesSubString("1234 23 5 32 5 3 5 54 5 323", " "), -1);
        Assert.assertEquals(countEntriesSubString("1234 23 5 32 5 3 5 54 5 323", " "), -1);
        Assert.assertEquals(countEntriesSubString("1234 23 5 32 5 3 5 54 5 323", null), -1);
        Assert.assertEquals(countEntriesSubString(null, "12"), -1);
        Assert.assertEquals(countEntriesSubString("1234 23 5 32 5 3 5 54 5 323", "null"), 0);
    }




}
