package Revison2704;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver Driver = new ChromeDriver();
			
			Thread.sleep(1000);
			Driver.manage().window().maximize();
			Driver.get(" https://www.reebok.com");
			Thread.sleep(1000);
			String Currenturl = Driver.getCurrentUrl();
			Thread.sleep(1000);
			System.out.println(" the current Url is "+ Currenturl);
			
			Driver.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
			
		}
	}

}
