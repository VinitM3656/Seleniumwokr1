package AutomationCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAndIdLocatorExample {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https:// www.facebook.com");
			
			Thread.sleep(2000);
			
			WebElement emailfield = driver.findElement(By.cssSelector("input#emailfield"));
			
			WebElement passfield = driver.findElement(By.cssSelector("input#pass"));
		
			emailfield.sendKeys("vinit");
			Thread.sleep(2000);
			
			passfield.sendKeys("vnit@13");
			
			Thread.sleep(2000);
			driver.close();
		}	
			catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
				
			}
	}

}
