package seleniumpractice.WaitsInSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotation {
	@Test
	void TestCase1() {
		System.out.println("Test Case 1 is executed");
		Assert.fail();
		
	}
	@Test(dependsOnMethods= " testcase1")
	void TestCase2() {
		System.out.println(" TestCase 2 is executed");
		
	}
	

}
