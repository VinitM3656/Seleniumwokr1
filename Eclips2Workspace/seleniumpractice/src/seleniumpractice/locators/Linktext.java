
package seleniumpractice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			WebElement forgotpasswordLink = driver.findElement(By.linkText("Forgotten password"));
			 forgotpasswordLink.click();
			 
			//WebElement emailfield = driver.findElement(By.linkText(null))
		Thread.sleep(2000);
		driver.close();
		
			 
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
