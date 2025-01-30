package seleniumpractice.WaitsInSelenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterClass {
    @BeforeClass
    void beforeClass() {
        System.out.println("Before class method called");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("Before test method called");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("After method called");
    }

    @Test
    void testMethod() {
        System.out.println("Test method called");
    }
}
