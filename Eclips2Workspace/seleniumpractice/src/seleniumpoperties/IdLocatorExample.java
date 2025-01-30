package seleniumpoperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorExample {
	
public static void main(String [] args) {
	
	try {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		 String currentUrl = driver.getCurrentUrl();
		 String pageSource = driver.getPageSource();
		 String Title = driver.getTitle();
		 
		 WebElement emailField = driver.findElement(By.id("email"));
		 
		 WebElement password = driver.findElement(By.id("password"));
		 
		 emailField.sendKeys("vinit@gmail.com");
		 
		 Thread.sleep(2000);
		 
		 password.sendKeys(" vinit@123");
		 
		 Thread.sleep(2000);
		 
		 driver.close();
		
	} catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
		 
	}
}

}
