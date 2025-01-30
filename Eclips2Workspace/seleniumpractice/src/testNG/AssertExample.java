package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {
	
	@Test (invocationCount= 5000)
	void testcase1() {
		
		System.out.println("Test case 1 is executed");
		Assert.fail();//delibratley makinf fai; test case
	}

	@Test(dependsOnMethods="testcase1",alwaysRun = true)
	
	void testCase2() {
		System.out.println(" test acse 2 executed");
	}
}
