package seleniumpractice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class absoultexpath { 
	public static void main(String [] args) {
		
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			
			WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
			
			WebElement passfield=driver.findElement(By.xpath("//input[@id='pass']"));
			emailField.sendKeys("vinit@gmail.com");
			Thread.sleep(2000);
			
			passfield.sendKeys("Vinit@1234");
			Thread.sleep(2000);
			
			driver.quit();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
