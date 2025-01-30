package testNG;

import org.testng.annotations.Test;

public class GroupingTestCasesExample {
	
	@Test(groups = " login")
	void testCase1() {
		System.out.println("Test case 1 executed");
	}
	@Test(groups="inbox")
	
	void testcase2() {
		
		System.out.println(" inbox");
	}

	@Test(groups="drafts")
	
	void testcase3() {
		System.out.println(" drafts");
		
	}
}
