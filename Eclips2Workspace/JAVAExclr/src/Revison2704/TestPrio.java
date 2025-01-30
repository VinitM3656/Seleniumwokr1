package Revison2704;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import junit.framework.Test;

public class TestPrio {
	@Test(priority=4)
	void testMethod1() {
		
		System.out.println(" test method 1 is called");
		
	}
	
	@Test(priority=2)
	void testMethod3() {
		System.out.println(" test Method 2 is eecuted");
		
	}

	@Test(priority=1)
	void testMethod2() {
		System.out.println(" Test method is executed");
		
		
}
}