package Practice99.BeforeAndAfterClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	
	public static void main(String [] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			driver.get("https://www.facebook.com");
			
			Thread.sleep(2000);
			WebElement emailfield = driver.findElement(By.className("inputtext"));
			
			WebElement passfield = driver.findElement(By.className("_9npi"));
					
			emailfield.sendKeys(" vinitbmhetre");
			Thread.sleep(2000);
			
			
			passfield.sendKeys("binti");
			Thread.sleep(3000);
			
		driver.close();
		
		} catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}
	}

}
