package seleniumpoperties;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordDrivenFrameworkExample {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			FileInputStream fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\seleniumpractice\\src\\seleniumpoperties\\Data3.properties");
			
			Properties p = new Properties();
			p.load(fis);
			String UserNameLocator = p.getProperty("locator.username");
			
			String passwordLocator=p.getProperty("locator.password");
			
			String loginButton=p.getProperty("locator.loginbtn");
			
			String menuButtonLocator= p.getProperty("locator.menubtn");
			
			String logoutLocator=p.getProperty("locator.logout");
			
			
			
			driver.get("https://www.saucedemo.com");
			
			String userName =
					driver.findElement(By.xpath(userName));
			WebElement password =
					driver.findElement(By.xpath(passwordLocator));
					WebElement loginButton1 =
					driver.findElement(By.xpath(logoutLocator));
					userName.sendKeys("standard_user");
					Thread.sleep(3000);
					password.sendKeys("secret_sauce");
					Thread.sleep(3000);
					loginButton1.click();
					WebElement menuButton =
					driver.findElement(By.xpath(menuButtonLocator));
					WebElement logout =
					driver.findElement(By.xpath(logoutLocator));
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
