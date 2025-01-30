package VinitRevisionAutomation.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	public static void main(String [] args) {
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			
			Thread.sleep(3000);
			
			WebElement emailaddressfield= driver.findElement(By.id("email"));
			WebElement passwordfield = driver.findElement(By.id("password"));
		 Thread.sleep(3000);
		 emailaddressfield.sendKeys("Vinitbmhetre@gamil.com");
		 Thread.sleep(2000);
		 passwordfield.sendKeys(" vinit@123");
		 Thread.sleep(2000);
		 driver.close();
		 
		 
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	

}
