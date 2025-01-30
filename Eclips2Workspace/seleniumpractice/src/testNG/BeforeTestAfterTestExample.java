package testNG;

import org.junit.Before;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAfterTestExample {
	
	@Test
	
	void testCase1() {
		System.out.println(" Test case 1 is executed");
	}
	
	@Test
	void testCase2() {
		System.out.println(" test case 2 is executed");
	}

	
	@BeforeMethod()
		void BeforeMethod() {
			System.out.println("Before Method executed");
		}
	@AfterMethod()
	void AfterMethod() {
		System.out.println(" After Method is executed");
	}
	
	@BeforeClass
	void beforeClass() {
		
		System.out.println(" before class is executed");
		
	}
	
	@AfterClass
	void afterClass() {
	System.out.println("After Class executed");
	}
	@BeforeTest
	void beforeTest() {
	System.out.println("Before Test executed");
	}
	@AfterTest
	void afterTest() {
	System.out.println("After Test executed");
	
}
	
	
}
