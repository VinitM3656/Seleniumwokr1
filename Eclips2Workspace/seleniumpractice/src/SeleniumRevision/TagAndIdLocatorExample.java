package SeleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAndIdLocatorExample {
	
	public static void main(String [] args) {
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			driver.get("https://www.facebook.com");
			
			Thread.sleep(3000);
			
		WebElement emailfield = driver.findElement(By.cssSelector("input#email"));
		WebElement passfield = driver.findElement(By.cssSelector("input#pass"));
		
		emailfield.sendKeys("vinit@gmail.com");
		
		passfield.sendKeys(" vinit@123");
		
		Thread.sleep(3000);
		driver.close();
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
