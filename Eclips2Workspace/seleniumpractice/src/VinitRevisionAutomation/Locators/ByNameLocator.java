package VinitRevisionAutomation.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByNameLocator {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(4000);
			driver.manage().window().maximize();
			
			driver.get(" https://www.facebook.com");
			
			Thread.sleep(4000);
			WebElement emailField = driver.findElement(By.name("email"));
			WebElement passwordField =driver.findElement(By.name("pass"));
;
			Thread.sleep(2000);
			
			emailField.sendKeys("vinitbmhetre");
			Thread.sleep(2000);
			passwordField.sendKeys(" vinit");
			Thread.sleep(2000);
			
			driver.close();
			
			
			
			
		}  catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
			
		}
	}


}
