package AutomationCodes;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheCurrentURLFromTheWebPageExample {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.bookmyshow.com");
			String currentUrl = driver.getCurrentUrl();
			
	}catch(Exception e) {
		
		System.out.println(e.getMessage());
		
	}

}
}
