package AutomationCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorExample {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com");
			
			Thread.sleep(2000);
			
			WebElement emailfield = driver.findElement(By.name("email"));
			WebElement passfield = driver.findElement(By.name("pass"));
			
			Thread.sleep(2000);
			emailfield.sendKeys("vinir@gmail.com");
			passfield.sendKeys("vinirr@123");
			Thread.sleep(2000);
			driver.close();
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			
			
		}
	}

}
