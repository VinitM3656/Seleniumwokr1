package Practice99.BeforeAndAfterClass;

import org.testng.annotations.Test;

public class TestCasepriority {
	@Test
	
	void testMethodC() {
		System.out.println(" test case  c3 is executed");
		
	}
	
	@Test
	void testMehtodD() {
		System.out.println(" test case D4 is execute");
		
	}
	@Test
	void TestMethodB() {
		System.out.println(" test case B2 is execute");
		
	}
	
	@Test
	void TestMethodA() {
		System.out.println(" test acse A1 is execute");
		
	}
@Test
	
	void testMethodE() {
		System.out.println(" test case  E4 is executed");
}
}
