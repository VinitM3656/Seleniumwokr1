package seleniumpractice.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABSOLUTEXpath {
	
	public static void main(String [] args) {
		
		try {
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			WebElement emailField=driver.findElement(By.xpath("//input[@id='email']"));
			WebElement passField = driver.findElement(By.xpath("//input[@id='pass']"));
			
			emailField.sendKeys("Vinit@gmail.com");
			
			Thread.sleep(3000);
			passField.sendKeys("Vinit@223");
			//++--+login.click();
			Thread.sleep(3000);
			driver.quit();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
