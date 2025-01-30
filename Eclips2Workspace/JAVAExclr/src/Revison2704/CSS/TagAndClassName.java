package Revison2704.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAndClassName {
	public static void main(String [] args) {
		
		try {
			
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		WebElement emailfield= driver.findElement(By.cssSelector("inut#eamil"));
		WebElement passwordfield= driver.findElement(By.cssSelector("inut#pass"));
		emailfield.sendKeys("sachin@gmail.com");
		Thread.sleep(2000);
		passwordfield.sendKeys("sachin1234");
		Thread.sleep(2000);
		driver.close();
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		}
		
	}

}
