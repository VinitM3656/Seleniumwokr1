package seleniumpractice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {
	
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com");
			
			Thread.sleep(2000);
			
			String gettitle = driver.getTitle();
			
			System.out.println(" the title is"+ gettitle);
			Thread.sleep(1000);
			 
			
			String pageSource= driver.getPageSource();
			System.out.println(" the pageSource code is"+ pageSource);
			
			WebElement emailField = driver.findElement(By.className("email"));
			
			WebElement passField = driver.findElement(By.className("pass"));
			
			Thread.sleep(2000);
			
			driver.close();
			
			
			
			
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
