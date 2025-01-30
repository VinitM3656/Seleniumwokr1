package Practice99.BeforeAndAfterClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			driver.get("https://www.facebook.com");
			
			WebElement username = driver.findElement(By.name("userName"));
			
			
	username.sendKeys("vinitbmhetre");
	
	
Thread.sleep(1000);

WebElement passfield = driver.findElement(By.name("pass"));

passfield.sendKeys("vinit@123");
Thread.sleep(2000);

		 driver.quit();
		 
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		}
	