package seleniumpoperties;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
public static void main(String [] args) {
	try {
		
		ChromeDriver Driver = new ChromeDriver();
		
		Thread.sleep(3000);
		Driver.get(" https:///www.google.com");
		String.Title = Driver.getTitle();
		System.out.println(" this is the title of "+Title);
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
}