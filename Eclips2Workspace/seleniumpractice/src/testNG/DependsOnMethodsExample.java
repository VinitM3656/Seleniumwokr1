package testNG;

import org.testng.annotations.Test;

public class DependsOnMethodsExample {
	
	@Test
	void testCase1() {
		
		System.out.println(" Test case 1 is executed");
	}
	
	@Test(priority = -1, dependsOnMethods = "testCase1")

	void testCase2() {
		System.out.println(" Test case 2 executed");
	}
}
