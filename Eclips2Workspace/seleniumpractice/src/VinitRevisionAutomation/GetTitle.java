package VinitRevisionAutomation;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class GetTitle {
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			
			
			String title = driver.getTitle();
			String CurrentURL= driver.getCurrentUrl();
			String GetSourceCode = driver.getPageSource();
			System.out.println(" the current Url is "+ title);
			System.out.println(" the source code is"+ GetSourceCode);
			System.out.println(" the currentURL is"+ CurrentURL);
			}catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
			//	driver.close();
			}
		
		
		
	}

}
