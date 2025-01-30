package seleniumpractice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS3 {
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(1000);
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			
			WebElement emailField = driver.findElement(By.cssSelector(" input[data-testid='royal_email']"));
			WebElement passField = driver.findElement(By.cssSelector("input[data-testid='royal_pass']"));
			
			
			emailField.sendKeys("Vinit@gmail.com");
			passField.sendKeys("Vinit@1223");
			Thread.sleep(2000);
			driver.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
			
		}
	}

}
