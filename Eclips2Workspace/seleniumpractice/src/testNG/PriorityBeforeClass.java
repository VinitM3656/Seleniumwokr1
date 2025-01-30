package testNG;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityBeforeClass {
	
	@BeforeClass
	void beforeclass() {
		
		System.out.println("Before class called");
		
	}
	
	@AfterClass
	void afterclass() {
		
		System.out.println(" afetr class called");
	}



@BeforeMethod
void beforeMethod() {
	
	System.out.println(" Before method executed");
	
}

@AfterMethod

void testCase1() {
	System.out.println("Test case 1 executed");
}

@Test
void testCase2() {
	System.out.println("Test Case 2 executed");
}
}