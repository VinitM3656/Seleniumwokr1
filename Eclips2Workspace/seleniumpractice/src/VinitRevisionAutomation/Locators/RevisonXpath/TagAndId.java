package VinitRevisionAutomation.Locators.RevisonXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAndId {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver Driver = new ChromeDriver();
			Thread.sleep(3000);
		Driver.manage().window().maximize();
		
		Driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		WebElement emailField= Driver.findElement(By.cssSelector("input#email"));
		
		WebElement passField = Driver.findElement(By.cssSelector("input#pass"));
		
		emailField.sendKeys("sachine123");
		
		Thread.sleep(2000);
		
		passField.sendKeys("sachine1234");
		
		Thread.sleep(2000);
		Driver.close();
		
		
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
