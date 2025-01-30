package Revison2704;

import org.testng.annotations.Test;

public class TestPri {
	@Test(priority = 4)
	void testMethod1() {
		System.out.println("this has to executed at number 4 ");
		
	}

	@Test(priority = 1)
	void testMethod2() {
		System.out.println(" this method has to be run 1");
		
	}
	
	@Test(priority = 3)
	void testMethod3() {
		System.out.println(" this methofa has to run 3rd number");
		
	}

@Test(priority = 2)
void testMethod4() {
	System.out.println(" this method has to run2nd");
	
}
}

