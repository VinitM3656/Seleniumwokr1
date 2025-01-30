package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class GetCurrentUrl {

	
	
	public static void main(String [] args) {
	
		try {
			
			WebDriver  driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get(" https://www.acer.com");
			String title= driver.getTitle();
			System.out.println(" the tile is"+ title);
			
		}catch(Exception e) {
           System.out.println(e.getMessage());
           
		}
	}
	
		}