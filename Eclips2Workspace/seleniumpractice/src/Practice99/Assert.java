package Practice99;

import org.testng.annotations.Test;

public class Assert {
	@Test
	void tastCase1() {
		System.out.println(" test case1 is executed");
	
	}
	@Test(dependsOnMethods="testCase1")
		void testcase2() {
			System.out.println(" test case 2 is exevuted");
			
		}
		
	@Test
	void testcase21() {
		System.out.println(" test case 2 is exevuted");
		
	}


	@Test(dependsOnMethods="testCase21")
	void testcase22() {
		System.out.println(" test case 2 is exevuted");
		
	}
	
	@Test(dependsOnMethods="testCase23",alwaysRun = true)
	void testcase89() {
		System.out.println(" test case 2 is exevuted");
		
	}
}

