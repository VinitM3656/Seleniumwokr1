package Practice99.Frames;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keword {
	
	public static void main(String [] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			FileInputStream fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\seleniumpractice\\src\\Practice99\\Frames\\KeywordDriver.properties");
			
			Properties p = new Properties();
			
			p.load(fis);
			String usernameLocator = p.getProperty(" locator.username");
			
			
			String PasswordLocator = p.getProperty("locator.password");
			
			String LoginButtonLocator = p.getProperty("Locator.login");
			String MenubuttonLocator  = p.getProperty("Locator.menubutton");
			String LogoutLocator = p.getProperty("Locator.logout");
			
			driver.get("https://www.saucedemo.com");
			
			WebElement userName =driver.findElement(By.xpath(usernameLocator));
					WebElement password =
					driver.findElement(By.xpath(PasswordLocator));
					WebElement loginButton =
					driver.findElement(By.xpath(LoginButtonLocator));
					userName.sendKeys("standard_user");
					Thread.sleep(3000);
					password.sendKeys("secret_sauce");
					Thread.sleep(3000);
					loginButton.click();
					WebElement menuButton =
					driver.findElement(By.xpath(MenubuttonLocator));
					WebElement logout =
					driver.findElement(By.xpath(LogoutLocator));
					Thread.sleep(3000);
					menuButton.click();
					Thread.sleep(3000);
					logout.click();
					Thread.sleep(3000);
					driver.quit();
					} catch (Exception e) {
					System.out.println(e.getMessage());
					}
					
					

			
			
			
		}
	

}
