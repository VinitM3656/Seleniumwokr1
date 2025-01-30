package Revison2704;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(1000);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement forgotPasswordLink = driver.findElement(By.linkText("forgootenpassword"));
		forgotPasswordLink.click();
		Thread.sleep(2000);
		driver.close();
		
		
		}catch(Exception e ) {
			
			System.out.println(e.getLocalizedMessage());
			
		}
		}
	}