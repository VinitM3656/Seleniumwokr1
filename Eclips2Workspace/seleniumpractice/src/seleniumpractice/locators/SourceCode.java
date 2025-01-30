package seleniumpractice.locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class SourceCode {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			 driver.get("https://www.google.com");
			driver.manage().window().maximize();
			 
			 Thread.sleep(2000);
			 String getTitle = driver.getTitle();
			 String SourceCode = driver.getPageSource();
			 System.out.println(" the source code"+ SourceCode);
			 System.out.println(" the tile is "+ getTitle);
			  driver.close();
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
