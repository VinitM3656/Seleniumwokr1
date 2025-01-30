package Revison2704;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClass {
   // @BeforeClass
    void beforeClass() {
        System.out.println("Before class is called");
    }

    @AfterClass
    void afterClass() {
        System.out.println("After class called");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("Before method is executed");
    }

    @Test
    void testCase() {
        System.out.println("Test case is getting executed");
    }

    @Test
    void testCase2() {
        System.out.println("Test case 2 is executed");
    }
}
