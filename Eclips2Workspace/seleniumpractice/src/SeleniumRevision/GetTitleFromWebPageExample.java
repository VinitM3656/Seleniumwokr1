package SeleniumRevision;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleFromWebPageExample {
	public static void main(String [] args) {
		
		try {
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.get("https://www.bookmyshow.com");
			String Title = driver.getTitle();
			
			System.out.println(" the title is "+ Title);
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
