package AutomationCodes;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceExample {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			 String Sourcecode = driver.getPageSource();
			 System.out.println(" the source code is ");
			 
			 
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
