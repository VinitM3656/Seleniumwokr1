package seleniumpoperties;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheCurrentURLFromTheWebPageExample {
	
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			driver.get(" https://wwww.facebook.com");
			Thread.sleep(3000);
			
			String getTitle = driver.getTitle();
			
			String currentUrl = driver.getCurrentUrl();
			
			String pageSource = driver.getPageSource();
			
			System.out.println(" now we spoted current url"+getTitle);
			
			System.out.println(" we haveing page source codde"+ pageSource);
			
			System.out.println(" we are now having current URL"+ currentUrl);
			
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}
		
	}