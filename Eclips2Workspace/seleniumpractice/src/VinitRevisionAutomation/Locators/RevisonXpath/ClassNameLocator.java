package VinitRevisionAutomation.Locators.RevisonXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String [] args) {
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get(" https://www.facebook.com");
			Thread.sleep(3000);
			
			WebElement emailField = driver.findElement(By.className("inputtext"));
			
			WebElement passField = driver.findElement(By.className("_9npi"));
			
			emailField.sendKeys(" vinit@gmail.com");
			Thread.sleep(2000);
			
			passField.sendKeys(" vinit@14");
			
			Thread.sleep(3000);
			
			driver.close();
			
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
