package Prachi;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivern {
	
	public static void main(String [] args) {
		try {
			
			ChromeDriver  driver = new ChromeDriver();
			
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			FileInputStream fis = new FileInputStream( " D:\\Eclips\\SeleniumWebDRIVER025\\NewDemo\\src\\Prachi\\Data.properties");
			
			Properties p = new Properties();
			
			String url = p.getProperty("url");
			String un = p.getProperty("username");
			String pw = p.getProperty("password");
			
			
			
			
			driver.get(url); 
			WebElement userName = driver.findElement(By.xpath(" //input[@id='user-name']"));
			WebElement password = driver.findElement(By.xpath(" //input[@id='password']"));
			
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
			
			
			userName.sendKeys(un);
			Thread.sleep(3000);
			
			password.sendKeys(pw);
			Thread.sleep(3000);
			
			loginButton.click();
			
			WebElement menuButton = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
			
			WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
			
			Thread.sleep(3000);
			
			menuButton.click();
			Thread.sleep(3000);
			logout.click();
			
			driver.quit();
			
			
			
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
