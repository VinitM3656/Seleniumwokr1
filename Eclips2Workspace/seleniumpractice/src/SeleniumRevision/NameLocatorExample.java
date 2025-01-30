package SeleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorExample {
	
	public static void main(String [] args) {
		
		 try {
			 
			 ChromeDriver driver = new ChromeDriver();
			 
			 Thread.sleep(2000);
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 
			 driver.get("https://www.facebook.com");
			 Thread.sleep(3000);
			 WebElement emailfield = driver.findElement(By.name("email"));
			 WebElement passfield = driver.findElement(By.name("pass"));
			 
			 
			 emailfield.sendKeys("vinir@gmail.com");
			 
			 Thread.sleep(2000);
			 
			 driver.close();
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	}

}
