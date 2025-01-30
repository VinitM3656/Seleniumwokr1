package seleniumpractice.WaitsInSelenium;

import org.testng.annotations.Test;

public class GroupTestCases {
	@Test(groups = " login")
	void testCase1() {
		System.out.println(" test case 1 executed");
		
	}
	@Test(groups= "inbox")
	void testCase2()
	{
		System.out.println(" test case 2 execued");
	}
 @Test(groups = "drafts")
 void TestCase3() {
	 System.out.println(" test case 3 is executed");
	 
 }
 
 @Test(groups = "login")
 void TestCase4() {
	 System.out.println(" test cas 4 is executed");
	 
 }
 @Test(groups = "inbox")
 void TestCase5() {
	 
	 
	 System.out.println(" test case 5 is executed");
	 
 }
 }
