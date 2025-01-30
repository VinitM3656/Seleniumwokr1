package VinitRevisionAutomation.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.get("https://www.facebook.com");

			Thread.sleep(3000);
			
			WebElement emailField=driver.findElement(By.className("inputText"));
			WebElement passwordField = driver.findElement(By.className("_9npi"));
			
			emailField.sendKeys("sachinbmhetre@gamail.com");
			Thread.sleep(3000);
			
			passwordField.sendKeys("vinit@123");
			Thread.sleep(3000);
			driver.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		
			
		}
	}

}
