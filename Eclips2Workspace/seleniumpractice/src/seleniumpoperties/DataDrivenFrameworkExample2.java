package seleniumpoperties;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFrameworkExample2 {
	public static void main(String [] args) {
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			FileInputStream fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\seleniumpractice\\src\\seleniumpoperties\\Data2.properties");
			Properties p = new Properties();
			
			p.load(fis);
			String url = p.getProperty("url");
			String un = p.getProperty("username");
			String pw = p.getProperty("password");
			driver.get(url);
			 WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
			 
			 
			 WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			 
			 WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		
			 userName.sendKeys(un);
			 Thread.sleep(2000);
			 
			 password.sendKeys(pw);
			 Thread.sleep(3000);
			 
			 loginButton.click();
			 
			 WebElement menuButton= driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']"));
			 
			 
			 WebElement logout= driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
			 Thread.sleep(3000);
			 
			 menuButton.click();
			 Thread.sleep(2000);
			 
			 driver.quit();
			 
			 
			
			 
			 
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
