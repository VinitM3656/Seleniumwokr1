package testNG;

import org.testng.annotations.Test;

public class FirstExample {
	
	// cosider a normal menthod
	
	void testCase1() {
		
		System.out.println(" this is normal method");
	}
	
	@Test
	//conside this is test acse
	void testCase2() {
		System.out.println(" this is test case method");
	}
	

}
