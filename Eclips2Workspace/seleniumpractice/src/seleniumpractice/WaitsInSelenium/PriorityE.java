package seleniumpractice.WaitsInSelenium;

import org.testng.annotations.Test;

public class PriorityE {
	@Test(priority = 3)
	void testMethod1() {
		System.out.println(" Method 4 is executed");
		
	}@Test(priority =1)
	void TestMethod2() {
		System.out.println(" method 3 is executed");
		
	}
	@Test(priority = 2)
	void TestMethod3() {
	System.out.println(" method 5 is executed") ;
	}
        
}
