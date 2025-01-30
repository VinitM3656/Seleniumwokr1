package SeleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAndClassNameLocatorExample {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com");
			
			Thread.sleep(3000);
			WebElement emailfield = driver.findElement(By.cssSelector("input.inputtext"));
			
			Thread.sleep(3000);
			emailfield.sendKeys("sachin@gmail.com");
			WebElement passwordfield= driver.findElement(By.cssSelector("input_9npi"));
			
			
			Thread.sleep(3000);
			
			driver.close();
			
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
