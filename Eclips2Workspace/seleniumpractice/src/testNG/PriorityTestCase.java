 package testNG;

import org.testng.annotations.Test;

public class PriorityTestCase {
	@Test(priority = 4)
	
	void testMethod1() {
		
		System.out.println(" Test method 1 called");
		
	}
	@Test(priority = 0)
	
	void testMethod2() {
		System.out.println(" test method 2 is getting called");
	}

	
	@Test(priority = -3)
	void testMethod3() {
		System.out.println(" test method 33333 is getting called");
	}
	
	@Test(priority = 1)
	void TestMethod4() {
		System.out.println(" test method 4 is getting executed");
	}
	
	
	
	@Test(priority = 1)
	void TestMethod5() {
		System.out.println(" test method 478876 is getting executed");
	}
}
