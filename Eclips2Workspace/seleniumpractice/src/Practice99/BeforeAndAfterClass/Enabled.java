package Practice99.BeforeAndAfterClass;

import org.testng.annotations.Test;

public class Enabled {
	@Test
	void testcase1() {
		
		System.out.println(" test case 1 executed");
	}

	@Test(enabled = false)
	void testcase2() {
		System.out.println(" test acse 2 i executed");
	}

	
	@Test(invocationCount=1099)
	void testCase3() {
	System.out.println("Test case 3 executed");
	}
	}

