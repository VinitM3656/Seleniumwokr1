package Repractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	
	public static void main(String [] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get(" https://www.facebook.com");
			
			Thread.sleep(2000);
			driver.manage().window().maximize();
			 String SOurcecode = driver.getPageSource();
			 String CurrentUrl = driver.getCurrentUrl();
			  Thread.sleep(1000);
			  WebElement emailfield = driver.findElement(By.name("email"));
			  WebElement passwordField = driver.findElement (By.name("password"));
			  emailfield.sendKeys("vinitbmhetre@gmail.com");
			  Thread.sleep(1000);
			  passwordField.sendKeys(" vinit");
			  
			   driver.quit();
			   
			  
			  
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
