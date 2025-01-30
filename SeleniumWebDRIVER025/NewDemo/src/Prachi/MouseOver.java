package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	public static void main(String [] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.in");
		WebElement element = driver.findElement(By.linkText("Shipping & Payments"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		

}
}
