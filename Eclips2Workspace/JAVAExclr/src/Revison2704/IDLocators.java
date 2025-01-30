package Revison2704;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocators {
	public static void main(String [] args) {
		try {
			
			ChromeDriver Driver = new ChromeDriver();
			Thread.sleep(2000);
			Driver.manage().window().maximize();
			Driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			WebElement emailField =
					Driver.findElement(By.id("email"));
					WebElement passwordField =
					Driver.findElement(By.id("pass"));
					emailField.sendKeys("sachin@gmail.com");
					Thread.sleep(3000);
					passwordField.sendKeys("sachin12345");
			Thread.sleep(2000);
			Driver.close();
			
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
