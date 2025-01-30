package POM;

import org.testng.annotations.Test;

public class TaseCase2 {
	@Test
	void test1() {
		
		System.out.println(" hello i am test1");
		
	}
	@Test
	void test2() {
		System.out.println(" hello i am test2");
		
	}
	@Test
	void test3() {
		System.out.println(" hello i am test 3");
		
	}
@Test(enabled = false)
	void test4() {
		System.out.println(" hello i am test4");
		
	}
}
