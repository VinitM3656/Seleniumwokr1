package VinitRevisionAutomation.Locators;

//package VinitRevisionAutomation.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLink2Locator {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(4000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get(" https://www.facebook.com");
			Thread.sleep(3000);
			WebElement emailField = driver.findElement(By.cssSelector("#email"));
			WebElement passwordField = driver.findElement(By.cssSelector("#pass"));
			Thread.sleep(3000);
			
		//hread.sleep(3000);
			driver.close();
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
