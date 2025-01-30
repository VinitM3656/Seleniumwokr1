package seleniumpractice.WaitsInSelenium.Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	public static void main(String [] args) {
		try {
			
			FirefoxDriver driver = new FirefoxDriver();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("D:\\MOVIES\\Selenium-LATEST\\alert.html");
			Thread.sleep(2000);
			driver.findElement(By.id("FirstName")).sendKeys("vinit");
			Thread.sleep(1000);
			driver.switchTo().frame("page_frame");
			driver.findElement(By.id("lastname")).sendKeys("Mhetre");
			Thread.sleep(2000);
			driver.close();
			
			
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
