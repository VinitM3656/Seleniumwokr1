package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCasesWithoutPriorityExample {
	
	@BeforeMethod
	void testMethod() {
		
		System.out.println("Test case BEFOREMETHOS@@@@@@@@ Excecuted");
		
	}
	
	@AfterMethod
	void testMethodE() {
		System.out.println("Test case AFTERMETHOD executed");
		
	}
	@Test
	void TestMethod() {
		System.out.println(" Test Case a is executed");
	}

	
	
	@Test
	void testMethodA() {
		System.out.println("Test case A is getting executed");
		
	}
	
	
	
	
	@Test
	void TestMethodB() {
		
		
		System.out.println(" test case B is executed");
		
	}
	
	
	@Test
	
	void testMehtodC() {
		
		System.out.println(" test case C is executed");
	}
	
	@Test
	
	void TestMethodD() {
		System.out.println(" test acse D is executed");
	}
}
