package seleniumpractice.WaitsInSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableMethod {
	@Test
	void TestCase1() {
		System.out.println("TestCase 1 is executed");
		Assert.fail();
	}
	
	@Test( dependsOnMethods= "testCase2", alwaysRun = true)
	void TestCase2() {
		System.out.println("TestCase 2 is executed");
		
	}
	
	@Test(enabled = false)
	void TestCase3() {
		System.out.println(" Test case 3 is executed");
		
	}
	@Test
	void TestCase4() {
		System.out.println("Test ccase 4 is executed");
		
	}
	@Test
	void TestCase5() {
		System.out.println(" Test case 5 is executed");
		
	}
	

}
