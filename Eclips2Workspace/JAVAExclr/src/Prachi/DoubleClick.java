package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String [] args) {
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();

		Driver.get("https://demoqa.com/button");
		
		WebElement button = Driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	Actions act = new Actions(Driver);
	act.doubleClick(button).perform();
	
		
		
	}

}
