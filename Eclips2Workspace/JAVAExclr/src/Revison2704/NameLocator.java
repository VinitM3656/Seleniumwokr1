package Revison2704;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver Driver = new ChromeDriver();
			Thread.sleep(2000);
			Driver.get(" https://www.facebook.com");
			Thread.sleep(2000);
			
		WebElement emailField = Driver.findElement(By.name("email"));
		WebElement passwordField = Driver.findElement(By.name("password"));
		
		emailField.sendKeys(" vinit@gmail.com");
		passwordField.sendKeys(" vinit@124");
		Thread.sleep(2000);
		Driver.close();
		
		
		
		
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
