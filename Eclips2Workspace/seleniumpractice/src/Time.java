import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);

			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensourcedemo.orangehrmlive.com/web/index.php/auth/login");
		
WebElement userName = driver.findElement(By.name("username"));
userName.sendKeys("Admin");
Thread.sleep(2000);

driver.quit();

		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
