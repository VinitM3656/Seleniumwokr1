package testNG;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Test acse c executed");
  }

  
  @Test(priority=4)
  void testMethodA() {
	  
	  System.out.println(" test case A  Executed");
  }
  
  
  @Test(priority=1)
  void testMethodC() {
	  
	  System.out.println(" test case c is executed");
	  
  }
  
  @Test(priority=2)
  void TestMethodD() {
	  
	  System.out.println("test acse D is executed");
  }  
	  @Test(priority=3)
	  void TestMethodB() {
		  
		  System.out.println(" test acse B is executed");
	  }
	  
  }
  
