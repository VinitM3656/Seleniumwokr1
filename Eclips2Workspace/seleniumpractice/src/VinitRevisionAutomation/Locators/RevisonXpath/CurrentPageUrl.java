package VinitRevisionAutomation.Locators.RevisonXpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentPageUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			
			driver.get("https://www.bookmyshow.com");
			driver.manage().window().maximize();
			String currentURL = driver.getCurrentUrl();
			String sourceCode = driver.getPageSource();
			System.out.println("Current URL -"+ currentURL);

			
			System.out.println(" currentsource code"+sourceCode);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
