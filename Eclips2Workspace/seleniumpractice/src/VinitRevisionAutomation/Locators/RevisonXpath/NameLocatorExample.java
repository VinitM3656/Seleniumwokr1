package VinitRevisionAutomation.Locators.RevisonXpath;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorExample {

	public static void main(String[] args) {
		
		try {
			ChromeDriver Driver = new ChromeDriver();
			Thread.sleep(3000);
			
	Driver.manage().window().maximize();

	Thread.sleep(2000);
	Driver.get(" https://www.facebook.com");
	Thread.sleep(3000);
	WebElement emailField=Driver.findElement(By.name("email"));
	
	WebElement passField=Driver.findElement(By.name("pass"));
	
	
	emailField.sendKeys(" vinit@gmail.com");
	Thread.sleep(2000);
	
	passField.sendKeys(" sachine1234");
	Thread.sleep(2000);
	Driver.close();
	
		}
		catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
			
			
			
		}
		// TODO Auto-generated method stub

	}

}
