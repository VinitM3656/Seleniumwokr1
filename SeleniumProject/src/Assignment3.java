//package Assignment3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment3 {
	WebDriver driver;
	//@BeforeTest
	public void initilize()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			
	}
	//@DataProvider(name ="Email")
	public Object[][]  dataSet()
	{
		Object[][] email=new Object[2][2];
		email[0][0]="Fbijapure.fb@gmail.com";
		email[0][1]="admin123";
		
		email[1][0]="Fbijapure.fb@gmail.com";
		email[1][1]="admin123";
		return email;
	}
		
		@Test(dataProvider="Email")
		public void emailandPass(String email,String pass) throws InterruptedException
		{
			driver.get("https://demo.guru99.com/test/login.html");
			Thread.sleep(2000);
			 driver.findElement(By.id("email")).sendKeys(email);
		     driver.findElement(By.id("passwd")).sendKeys(pass);
		}
		
		
		
	
	//@AfterTest
	public void afterTestMethod() {
		driver.close();
	}
	
}