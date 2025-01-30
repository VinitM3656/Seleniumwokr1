package Practice99.BeforeAndAfterClass;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	void testCase1() {
		System.out.println(" test acse 1 is executed");
		
	}
	
	@Test(priority = -1 ,dependsOnMethods= " testCase1")
	void testCase2() {
		System.out.println(" test case 2 is executed");
		
	}
}
