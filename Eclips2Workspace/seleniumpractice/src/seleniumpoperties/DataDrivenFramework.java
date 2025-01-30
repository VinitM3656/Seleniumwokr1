package seleniumpoperties;

import java.awt.MenuBar;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFramework {
	
	
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\seleniumpractice\\src\\seleniumpoperties\\Data.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		
		
		
		
		WebElement userName=	driver.findElement(By.xpath("//input[@id='user-name']"));
	
		WebElement password = driver.findElement(By.xpath("\"//input[@id='password']"));
		 WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		 
		 userName.sendKeys(un);
		 Thread.sleep(3000);
		 
		 password.sendKeys(pw);
		 
		 Thread.sleep(3000);
		 loginButton.click();
		 
		 
		 driver.findElement(By.xpath("//button[@id='reactburger-menu-btn']"));
		 
		 WebElement logout =
				 driver.findElement(By.xpath("//a[@id='logout_sideba r_link']"));
		 
		 
		 
		 
		 
		 Thread.sleep(3000);
		// MenuBar.click();
		 Thread.sleep(3000);
		 logout.click();
		 Thread.sleep(3000);
		 driver.quit();
		 } catch (Exception e) {
		 System.out.println(e.getMessage());
		 }
		 }
		 }
				 
		
		
		
