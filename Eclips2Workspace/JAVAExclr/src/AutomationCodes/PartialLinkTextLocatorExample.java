package AutomationCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocatorExample {
	
	public static void main(String [] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			Thread.sleep(3000);
			
			WebElement forgotpassworf= driver.findElement(By.partialLinkText("forgotten"));
			forgotpassworf.click();
			Thread.sleep(3000);
			
			driver.close();
		}
		
		catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
