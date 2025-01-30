package VinitRevisionAutomation.Locators.RevisonXpath;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAndClassName {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver Driver = new ChromeDriver();
			
			Thread.sleep(3000);
			Driver.manage().window().maximize();
			Thread.sleep(2000);
			Driver.get("https://www.facebook.com");
			Thread.sleep(3000);
			
			WebElement emailField= Driver.findElement(By.cssSelector("input#email"));
			WebElement passField= Driver.findElement(By.cssSelector("input#pass"));
			
			emailField.sendKeys("sachine@gmail.com");
			Thread.sleep(3000);
			passField.sendKeys("vinit@123");
			
			Thread.sleep(3000);
			Driver.close();
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
