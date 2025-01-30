package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	  
	  System.out.println("fucsdsdk");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("fudssdck");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
	  System.out.println("fuasfck");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  System.out.println("fucsssk");
  }

  @AfterClass
  public void afterClass() {
	  
	  
	  System.out.println("fucddk");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("fudgck");
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  System.out.println("fucrek");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("fudrck");
  }

  @AfterSuite
  public void afterSuite() {
  }

}
