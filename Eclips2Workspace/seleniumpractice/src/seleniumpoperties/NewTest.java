package seleniumpoperties;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println(" method is executing before method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println(" method is executing after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" method is executing before class");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
	  System.out.println(" EXECUTING after class");
  }
  

}
