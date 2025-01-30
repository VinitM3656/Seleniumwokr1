package seleniumpractice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWithCSS {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			
			driver.get("https://www.facebook.com");
			Thread.sleep(3000);
			 WebElement emailField= driver.findElement(By.cssSelector("input[id^='iden']"));
			 Thread.sleep(3000);
			  emailField.sendKeys("vinit@gmail.com");
			 Thread.sleep(3000);
			 driver.close();
			 
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
