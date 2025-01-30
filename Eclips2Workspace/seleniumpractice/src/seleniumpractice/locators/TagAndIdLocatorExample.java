package seleniumpractice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAndIdLocatorExample {
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			driver.get("https://www.facebook.com");
			
			Thread.sleep(2000);
			
			WebElement emailField = driver.findElement(By.cssSelector("input#email"));
			WebElement passField = driver.findElement(By.cssSelector("input#pass"));
			emailField.sendKeys("vinitbmhetre@gmail.com");
			Thread.sleep(2000);
			
			passField.sendKeys("vinit@123");
			Thread.sleep(1000);
			driver.close();
			
		
		}catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}
	}

}
