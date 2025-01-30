package seleniumpractice.locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
		
		Thread.sleep(3000);
		driver.get(" https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
WebElement emailField=		driver.findElement(By.cssSelector("email"));
WebElement passwordField= driver.findElement(By.cssSelector("password"));
Thread.sleep(2000);

emailField.sendKeys("Vinitbmhetre@gmail.com");
passwordField.sendKeys("Vinit@1234");
		
Thread.sleep(1000);
driver.close();

		}
		catch(Exception e) {
			
			
			System.out.println(e.getMessage());
			
			
			
		}
		
	}
		
	

}
