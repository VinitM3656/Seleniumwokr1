package seleniumpractice.WaitsInSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Parameterized {
    
    @Test
    void TestCase1() {
        System.out.println("TestCase1 is executed");
    } 
    
    @Test(dependsOnMethods = "testcase3")
    void TestCase2() {
        System.out.println("TestCase2 is executed");
    }
    
    @Test(enabled =  true)
    void testcase3() {
        System.out.println("TestCase3 is executed");
    }
   
    @Test(invocationCount = 1000)
    void TestCase4() {
        System.out.println("testcase 4 is executed");
    }
   
    @Test
    @Parameters({"url", "username", "password"})
    void TestCase5(String url, String username, String password) {
        System.out.println("test case 5 is executed");
        System.out.println("the url is " + url);
        System.out.println("the username is " + username);
        System.out.println("the password is " + password);
    }
}
