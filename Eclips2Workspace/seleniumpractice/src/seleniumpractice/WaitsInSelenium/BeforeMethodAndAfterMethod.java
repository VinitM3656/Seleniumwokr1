package seleniumpractice.WaitsInSelenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAndAfterMethod {
    @BeforeMethod
    void beforeMethod() {
        System.out.println("Before method called");
    }
    
    @AfterMethod
    void afterMethod() {
        System.out.println("After method called");
    }
    
    @Test
    void testCase1() {
        System.out.println("This is test case 1");
    }
    
    @Test
    void testCase2() {
        System.out.println("This is test case 2");
    }
}
