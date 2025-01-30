package seleniumpoperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocatorExample {
	
	public static void main(String [] args) {
		try {
			 ChromeDriver driver = new ChromeDriver();
			 
			 Thread.sleep(2000);
			 
			 driver.manage().window().maximize();
			 
			 driver.get(" https://www.facebook.com");
			 
			 String getUrl = driver.getCurrentUrl();
			 
			 String pagesource= driver.getPageSource();
					 
					 String title = driver.getTitle();
					 
					 
					 WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgotten password"));
//					  WebElement forgotPasswordLink=driver.findElement(By.linkText(title))
					 forgotPasswordLink.click();
			  Thread.sleep(3000);
			  driver.close();
			
		} catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}
	}

}
