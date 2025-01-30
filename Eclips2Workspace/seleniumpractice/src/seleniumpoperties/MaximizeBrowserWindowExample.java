package seleniumpoperties;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowserWindowExample {
	
	public static void main(String [] args, String PageSource) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			 Thread.sleep(3000);
			 
			 driver.manage().window().maximize();
			 
			 Thread.sleep(2000);
			 driver.get(" https:www.instagram.com");
			 
			 String currentUrl = driver.getCurrentUrl();
			 
			 String pageSource= driver.getPageSource();
			 
			 String title = driver.getTitle();
			
			 
			 System.out.println(" we having"+ currentUrl);
			 System.out.println("we having "+ PageSource);
			 System.out.println("we haveing"+ title);
			 
			 
			 
			 
			 
			
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
