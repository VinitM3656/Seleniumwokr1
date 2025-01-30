package Repractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLocator {
	
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.get("https://www.facebook.com");
			Thread.sleep(1000);
			String currentURL = driver.getCurrentUrl();
			Thread.sleep(1000);
			String pageSourceCode = driver.getPageSource();
			Thread.sleep(1000);
			WebElement forgotpasswordLink = driver.findElement(By.linkText("forgotten password"));
			
			forgotpasswordLink.click();
			Thread.sleep(2000);
			driver.close();
			
			
			
			
			
			
			
		}catch(Exception e) {
			
			System.out.println("e.getmessage");
			
		}
	}

}
