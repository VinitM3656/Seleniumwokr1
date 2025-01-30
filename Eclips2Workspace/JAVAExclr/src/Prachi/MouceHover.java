package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouceHover {
	public static void main(String [] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(" https://www.ebay.in/");
		 WebElement element = driver.findElement(By.linkText("Shopping & Payemnt"));
		 
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(element).perform();
	}

}
