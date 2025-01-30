package seleniumpoperties;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {
	@Test
	
	void tescase1() {
		
		System.out.println("Test case 1 is executed");
		Assert.fail();
	}
	
	@Test(dependsOnMethods="testCase1")
	void testCase2() {
		System.out.println("Test case 2 is executed");
	}

}
