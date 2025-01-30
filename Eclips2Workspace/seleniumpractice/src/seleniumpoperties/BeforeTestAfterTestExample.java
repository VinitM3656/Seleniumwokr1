package seleniumpoperties;

import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;

public class BeforeTestAfterTestExample {
	
	@Test
	
	void testcse1() {
		System.out.println("test acse 1 executed");
	}

	
	@Test
	
	void testcase2() {
		System.out.println("test case 1 executed");

	}
	
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("Before Method executed");
	}
	
	@AfterMethod
	void AfterMethod() {
		
		System.out.println("This method is executed after method");
	}
}
	
	
