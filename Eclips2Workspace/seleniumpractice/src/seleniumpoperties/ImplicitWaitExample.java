package seleniumpoperties;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {
	
	public static void main(String [] args) {
		try {
			
			
			ChromeDriver Driver = new ChromeDriver();
			
			Thread.sleep(3000);
			Driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    Driver.get("https://opensourcedemo.orangehrmlive.com/web/index.php/auth/login");
			    WebElement userName=Driver.findElement(By.name("username"));
			    
			    userName.sendKeys("Admin");
			    Thread.sleep(3000);
			
			    Driver.quit();
			    
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
