package seleniumpoperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorExample {
	
	public static void main(String[] args) {
		
		try {
			// Set the path to the ChromeDriver executable if it's not in your system's PATH
			//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.get("https://www.facebook.com");
			
			String currentUrl = driver.getCurrentUrl();
			String pageSource = driver.getPageSource();
			String getTitle = driver.getTitle();
			
			WebElement emailField = driver.findElement(By.name("email"));
			WebElement passField = driver.findElement(By.name("pass")); // Corrected locator
			
			emailField.sendKeys("vinit@gmail.com"); // Removed unnecessary space
			passField.sendKeys("vinit@123"); // Removed unnecessary space
			
			Thread.sleep(2000);
			
			driver.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
