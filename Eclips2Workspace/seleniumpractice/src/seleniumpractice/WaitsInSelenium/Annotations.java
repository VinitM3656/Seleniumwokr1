package seleniumpractice.WaitsInSelenium;

import org.testng.annotations.Test;

public class Annotations {
	@Test
	void TestCase1() {
		System.out.println(" test case1 is executed");
		
	}
	@Test(priority = -1, dependsOnMethods = " TestCase1")
	void testCase2() {
		System.out.println(" Test Case 2 is executed");
		
	}
	
	


	
}
