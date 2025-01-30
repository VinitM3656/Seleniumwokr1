package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Alerts {
	public static void main(String [] args) {
		try {
			
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://uitestpractice.com/Students/Switchto");
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		driver.switchTo().alert().sendKeys("Sudha");
		
		driver.switchTo().alert().accept();
		
		
			
	
		}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
	
}


	


