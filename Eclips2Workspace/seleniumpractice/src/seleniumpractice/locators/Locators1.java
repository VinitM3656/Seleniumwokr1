package seleniumpractice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	
	
	public static void main(String [] args) {
		
		try {
			
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com");
			
			Thread.sleep(2000);
			WebElement emailfield = driver.findElement(By.id("email"));
			WebElement passfield = driver.findElement(By.id("passwprd"));
			
			
	emailfield.sendKeys(" vinitbmhetre@gmail.com");
	
	passfield.sendKeys("vinit@123");
	Thread.sleep(3000);
	
	driver.close();
	
			
		}catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
