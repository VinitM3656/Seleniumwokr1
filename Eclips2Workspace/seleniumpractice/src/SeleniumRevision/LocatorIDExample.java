package SeleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIDExample {
	public static void main(String [] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		WebElement emailfield = driver.findElement(By.id("email"));
	WebElement passfield = driver.findElement(By.id("passs"));
	
	
	emailfield.sendKeys("sachine@gmail.com");
	
	Thread.sleep(2000);
	
	passfield.sendKeys(" vinit@123");
	
	Thread.sleep(2000);
	driver.close();
	
		
		
	}catch(Exception e) {
		
		System.out.println(e.getMessage());
		
	}

}
