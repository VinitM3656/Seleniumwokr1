package seleniumpractice.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTimeOut {  
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
			driver.get("https://opensource-demo.orangeHrmlive.com/web/index.php/auth/login");
		WebElement userName=driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
