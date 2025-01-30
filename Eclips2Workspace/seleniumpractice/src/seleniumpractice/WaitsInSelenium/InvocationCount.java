package seleniumpractice.WaitsInSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCount {
    
    @Test
    void TestCase1() {
        System.out.println("Testcase 1 is executed");
        Assert.fail();
    }
    
    @Test
    void TestCase2() {
        System.out.println("Testcase 2 is executed");
        Assert.fail();    
    }
    
    @Test(dependsOnMethods= "TestCase1")
    void TestCase3() {
        System.out.println("Testcase 3 is executed");
    }
    
    @Test
    void TestCase4() {
        System.out.println("Testcase 4 is executed");
    }
    
    @Test(enabled = false)
    void TestCase5() {
        System.out.println("Testcase 5 is executed");
    }
    
    @Test(invocationCount = 5)
    void TestCase6() {
        System.out.println("Testcase 6 is executed");
    }
}
