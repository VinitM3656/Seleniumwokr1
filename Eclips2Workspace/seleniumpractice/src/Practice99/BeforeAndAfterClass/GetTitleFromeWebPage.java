package Practice99.BeforeAndAfterClass;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleFromeWebPage {
	
	
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.bookmyshow.com");
			String title = driver.getTitle();
			System.out.println("the title is"+ title);
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
