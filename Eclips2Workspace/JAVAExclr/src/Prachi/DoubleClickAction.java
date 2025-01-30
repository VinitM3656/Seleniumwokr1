package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	
	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dbclick");
		Actions act = new Actions(driver);
		
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.xpath("/html/body/div"));
		
		String color = ele.getCssValue("color").toString();
		  System.out.println("color before double click:" + color); // blue

		  Thread.sleep(5000);
		  act.doubleClick(ele).build().perform();

		  Thread.sleep(2000);
		  color = ele.getCssValue("color").toString();
		  System.out.println("color after double click:" + color); // yellow

		  driver.close();
		 }

		

		
		
	}


