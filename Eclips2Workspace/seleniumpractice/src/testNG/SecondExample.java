package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondExample {
	@BeforeMethod
	
	void beforeMethod() {
		
		System.out.println(" Before method called");
		
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println(" this is after method called");
		
	}
	@Test
	void testCase1() {
		System.out.println(" this is test case 1");
		
	}
	@Test
	void testcase2() {
		System.out.println(" this is test case 2 ");
		
	}
	

}
