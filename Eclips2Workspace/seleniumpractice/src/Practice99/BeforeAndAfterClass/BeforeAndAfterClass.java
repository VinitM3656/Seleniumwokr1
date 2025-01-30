package Practice99.BeforeAndAfterClass;

import org.checkerframework.dataflow.qual.AssertMethod;
import org.junit.After;
import org.junit.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BeforeAndAfterClass {
@BeforeClass
void beforeclass() {
	System.out.println(" Before class is executed");
	
}
@After
void Afterclass() {
	System.out.println(" After Class is executed");
	
}
@BeforeTest
void BeforeMethod() {
	System.out.println(" BeforeMethod is executed");
	
}

@AssertMethod
void AfterMethod() {
	System.out.println(" AfterMethod is execute");
	
}
@Test
void Test() {
	System.out.println(" Test is executed");
	
}
@Test
void test() {
	System.out.println(" Test1 is execute");
}
}
