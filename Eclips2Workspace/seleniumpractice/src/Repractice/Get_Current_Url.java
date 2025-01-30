package Repractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_Url {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.get("https://www.bookmyshow.com");
			String currentURL= driver.getCurrentUrl();
			System.out.println(" current url"+ currentURL);
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
