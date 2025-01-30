package Repractice.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String [] args) {
		
		try {
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			
			driver.get(" https://www.facebook.com");
Thread.sleep(3000);
String CurrentUrl= driver.getCurrentUrl();
Thread.sleep(3000);
       driver.manage().window().maximize();
       Thread.sleep(2000);
       
       String SourceCode= driver.getPageSource();
        Thread.sleep(3000);
         WebElement emailfield = driver.findElement(By.id("email"));
         Thread.sleep(1000);
         WebElement passwordField= driver.findElement(By.id("password"));
         
         Thread.sleep(1000);
         emailfield.sendKeys("vinitbmhetre@gmail.com");
         Thread.sleep(1000);
         passwordField.sendKeys(" vinit@123");
         
         
         Thread.sleep(1000);
         
		} catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}
      

			
			
			
			
		}
	}


