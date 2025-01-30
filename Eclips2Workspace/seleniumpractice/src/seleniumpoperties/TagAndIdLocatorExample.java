
package seleniumpoperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAndIdLocatorExample {
	
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com");
			
			String getTitle = driver.getTitle();
			String pagesource = driver.getPageSource();
			
			String getUrl = driver.getCurrentUrl();
			
			
			System.out.println(" we having "+ getTitle+" "+pagesource+" "+ getUrl);
			 Thread.sleep(3000);
			 WebElement emailfield = driver.findElement(By.cssSelector("input#email"));
			 
			 WebElement passwordFiled = driver.findElement(By.cssSelector("input#pass"));
			 
			 emailfield.sendKeys("vinit@gmil.com");
			 
			 passwordFiled.sendKeys("vinit@123");
			 
			 Thread.sleep(3000);
			 driver.close();
			 
			 
			 
			 
			
			
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
