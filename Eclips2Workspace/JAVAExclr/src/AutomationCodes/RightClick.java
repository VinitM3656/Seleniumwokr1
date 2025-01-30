package AutomationCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			
			driver.get(" https://demoqa.com/buttons");
			WebElement doubleClickButton= driver.findElement(By.id(" double clickbtn"));
			
			WebElement  rightClickButton=driver.findElement(By.id(" rightclickbtn"));
			Thread.sleep(3000);
			 Actions a = new Actions(driver);
			 a.doubleClick(doubleClickButton).perform();
			 Thread.sleep(3000);
			 a.contextClick(rightClickButton).perform();
			 Thread.sleep(3000);
			 driver.quit();
			 
			 
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
