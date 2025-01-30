
package Prachi;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadF {

	
	public static void main(String [] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://demoqa/upload-download");
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		 Actions act = new Actions(Driver);
		 act.moveToElement(button).click().perform();
		 
		 Robot rb = new Robot();
		 rb.delay(0);
		 StringSelect ss = new StringSelection("")
		
	}
	
}
