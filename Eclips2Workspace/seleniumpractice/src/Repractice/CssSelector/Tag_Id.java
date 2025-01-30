package Repractice.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Id {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(1000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			String CurrentURL = driver.getCurrentUrl();
			Thread.sleep(1000);
			
			String PageSourcecode = driver.getPageSource();
			 Thread.sleep(1000);
			 
			 WebElement emailfield = driver.findElement(By.cssSelector(" inpute#emailfield"));
  WebElement passwordfield = driver.findElement(By.cssSelector("input#pass"));
  
  
  Thread.sleep(2000);
  emailfield.sendKeys("vinitbmhete@gmail.com");
  passwordfield.sendKeys(" vinit");
 
  Thread.sleep(2000);
  driver.close();
  } catch (Exception e) {
  System.out.println(e.getMessage());
  }
  }

  
  
  
}
