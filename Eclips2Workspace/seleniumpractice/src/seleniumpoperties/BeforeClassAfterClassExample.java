package seleniumpoperties;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeClassAfterClassExample {
	
	
	public class GroupingTestCasesExample {
		
		//public static void main(String [] args) {
		@Test(groups = "login")
		void testcase1() {
			System.out.println(" TEST case 1 executed");
			
		}
	@Test(groups= "inbox")
	   void testCase2() {
		System.out.println("Test case 2 executed");
		
	}

	@Test(groups = "drafts")

	void testcase3() {
		System.out.println("test case 3 executed");
		
	}
	
	@Test(groups = "login")
	void testCASE4() {
		System.out.println("Test case 4 executed");
		
	}
	
	@Test(groups= "inbox")
	void testcase5() {
		System.out.println(" test case 5 has executed");
	}
	@Test(groups= "login")
	void testcase6() {
		System.out.println("test case 6 has executed");
	}

	
	
	@Test(groups = "drafts")
	void testcase7() {
		
		System.out.println("test case 7 has executed");
	}
		
	@Test(groups = "login")
	void testcase8 () {
		
		System.out.println("test case 8 is executed");
	}
	}
	}
	
	
	
	
	