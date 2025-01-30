package seleniumpractice.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			WebElement UserName= driver.findElement(By.name("userName"));
			
			UserName.sendKeys("Admin");
			//WebElement passfield = driver.findElement(By.name("password"));
			Thread.sleep(2000);
			driver.quit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


}
