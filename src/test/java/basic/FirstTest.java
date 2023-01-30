package basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void firstMethod(){

        System.out.println("This is my first test");
        Assert.assertTrue(false);
    }
}
