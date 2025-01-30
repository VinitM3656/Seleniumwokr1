package Prachi;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	
	public static void main(String [] args) {
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement button = driver.findElement(By.id("file-upload"));
		
	Actions act = new Actions(driver);
	act.moveToElement(button).click().perform();
	
	try {
		
		
		Runtime.getRuntime().exec("Mhetre\\NPProt.bkp");
	}catch(IOException e) {
		
		e.printStackTrace();
		
	}
		
		
		
	}

}
