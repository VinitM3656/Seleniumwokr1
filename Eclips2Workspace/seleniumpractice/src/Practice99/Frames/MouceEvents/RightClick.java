package Practice99.Frames.MouceEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofNanos(10));
			driver.get("https://demoqa.com/button");
			WebElement doubleClickButton=driver.findElement(By.id("doubleClickButon"));
			 WebElement rightClickButton= driver.findElement(By.id(" rightClickbtn"));
			 Thread.sleep(3000);
			 Actions a = new Actions(driver);
			 a.doubleClick(doubleClickButton).perform();
			 Thread.sleep(3000);
			 a.contextClick(rightClickButton).perform();
			 Thread.sleep(3000);
			 driver.quit();
			 
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
