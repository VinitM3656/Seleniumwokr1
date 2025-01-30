package SeleniumRevision;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheCurrentURLFromTheWebPageExample {
	
	
	public static void main(String [] args) {
		 try {
			 
			 ChromeDriver driver = new ChromeDriver();
			 
			 Thread.sleep(2000);
			 
			 driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
driver.get("https://www.bookmyshow.com");
			 String currentURL = driver.getCurrentUrl();
			 System.out.println("Current URL-"+currentURL);
			 
			 
			 
			 String title = driver.getTitle();
			 System.out.println(" the current title is "+ title);
			 
			 
			 String pageSource= driver.getPageSource();
			 System.out.println(" the current source code is"+pageSource);
			 
			 driver.close();
		 }catch(Exception e) {
			 
			 System.out.println(e.getLocalizedMessage());
			 
			
		
			 
		 }
	}

}
