package seleniumpractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class GetCurrentPageUr {
	
	public static void main(String [] args) {
		try {
			
			WebDriver driver =  new ChromeDriver();
			
			Thread.sleep(1000);
			driver.get(" https://www.flipkart.com");
			String currentURL= driver.getCurrentUrl();
			System.out.println("current url"+ currentURL);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
			
		}
	}