package seleniumpoperties;

import org.testng.annotations.Test;

public class dependsOnMethods {
	
    @Test
    void testcase1() {
        System.out.println("test 1 is getting executed");
    }
	
    @Test(dependsOnMethods = "testcase1")
    void testcase2() {
        System.out.println("Test case 2 executed");
    }
}
