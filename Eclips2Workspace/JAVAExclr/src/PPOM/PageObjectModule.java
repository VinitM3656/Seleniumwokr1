package PPOM;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import Revison2704.DataDrivern;

public class PageObjectModule {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
			
		driver.get("https://www.saucedemo.com");
		LoginPage LoginPage = new LoginPage(driver);
		
		LoginPage.enterUserName();
		Thread.sleep(3000);
		
		LoginPage.enterPassword();
		Thread.sleep(3000);
		
		
		LoginPage.clickOnLogin();
		InventryPage inventryPage= new InventryPage();
		
		
		Thread.sleep(3000);
		
		inventryPage.changeFilters();
		
		
		Thread.sleep(3000); inventryPage.logout(); Thread.sleep(3000); driver.quit(); } catch (Exception e) { System.out.println(e.getMessage()); } } 
		
		



		
	}


