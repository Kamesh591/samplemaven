package basic;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test(description = "First Test case for Allure Implementation")
    @Description("This is an allure report test")
    public void firstMethod(){

        System.out.println("This is my first test");
        Assert.assertTrue(true);
    }

@Test(description = "This is 2nd test case")
@Description("2nd Test Allure Report")
    public void secondMethod(){
        System.out.println("Second Test");
    }

    @Test(description = "This is 3rd test case")
    @Description("3rd Test Allure Report")
    public void thirdMethod(){
        System.out.println("Second Test");
    }
}
