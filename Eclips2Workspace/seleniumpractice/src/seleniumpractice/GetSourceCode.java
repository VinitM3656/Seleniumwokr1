package seleniumpractice;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class GetSourceCode {

	public static void main(String [] args) {
		
		try {
			
			WebDriver driver = new ChromeDriver();
			Thread.sleep(4000);
			driver.get(" https://www.microsoft.com");
			String SourcCode = driver.getPageSource();
			System.out.println(" the current soource code"+ SourcCode);
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		}
	}