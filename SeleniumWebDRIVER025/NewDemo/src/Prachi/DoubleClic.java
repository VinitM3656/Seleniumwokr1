package Prachi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClic {
	
	
	public static void main(String[] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoqa.com/button");
			
			WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
			
			WebElement  rightClickButton = driver.findElement(By.id("rightClickBtn"));
			
			Thread.sleep(3000);
			
			Actions a = new Actions(driver);
			a.doubleClick(doubleClickButton).perform();
			
			Thread.sleep(3000);
			
			a.contextClick(rightClickButton).perform();
		Thread.sleep(3000);
		driver.quit();
		
			
		} catch(Exception e) {
			
			
			System.out.println(e.getMessage());
		}
	}

}
