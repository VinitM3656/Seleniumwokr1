package Revison2704;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutFramework {
	public static void main(String[] args) {
		
		try {
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get(" https://www.saucedemo.com");

			WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
			  username.sendKeys(" standard_user");
			  Thread.sleep(2000);
			  
			  password.sendKeys("secret_sauce");
			  Thread.sleep(3000);
			  
			  WebElement menuButton =
					  driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
			  WebElement Logout= driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
			  
			  Thread.sleep(3000);
			  menuButton.click();
			  Thread.sleep(2000);
			  
			  Logout.click();
			  Thread.sleep(3000);
			  driver.quit();
			  
			  
			  
			
			
		}catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
