package Revison2704;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAnd {
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://demoqa.com/buttons");
			WebElement DoubleClickMe = driver.findElement(By.id("doubleclickbtn"));
			WebElement RightClickMe = driver.findElement(By.id("RightClickBtn"));
			WebElement ClickMe= driver.findElement(By.id("ClickMe"));
			
			Actions a = new Actions(driver);
			a.doubleClick(DoubleClickMe).perform();
			Thread.sleep(2000);
			
			a.contextClick(RightClickMe).perform();
			Thread.sleep(2000);

			a.click(ClickMe).perform();
			
			
			
		}catch(Exception e) {
		System.out.println(e.getMessage());
		
		}
	}

}
