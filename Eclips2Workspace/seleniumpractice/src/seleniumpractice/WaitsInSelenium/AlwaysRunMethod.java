package seleniumpractice.WaitsInSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunMethod {
	@Test
	void TestCase1() {
		System.out.println("Test CCase 1 executed");
		Assert.fail();
	} 
	@Test( dependsOnMethods= " TestCase1", alwaysRun = true)
  void TestCase2() {
	  System.out.println(" Test case 2 executed");
  }
}
