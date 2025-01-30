package seleniumpractice.locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			driver.get("https://bookmyshow.com");
			String CurrentUrl = driver.getCurrentUrl();
			
			String title = driver.getTitle();
			
			String pageSource= driver.getPageSource();
			
			//System.out.println("Current page source code is"+pageSource+());
			
			System.out.println( "the current title is"+ ""+title());
			
			System.out.println(" the currentUrl is"+ currentUrl());
			
			
			
		}catch(Exception e) {
			
			
			System.out.println(e.getMessage());
			
		}
	}

	private static String title() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String currentUrl() {
		// TODO Auto-generated method stub
		return null;
	}}