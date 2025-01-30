package VinitRevisionAutomation.Locators.RevisonXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	
	public static void main(String []args) {
		
		
		try {
			//WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(4000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("https://www.facebook.com");
			Thread.sleep(3000);
			WebElement emailField =
			driver.findElement(By.xpath("//input[@datatestid='royal_email']"));
			WebElement passwordField =
			driver.findElement(By.xpath("//input[@datatestid='royal_pass']"));
			emailField.sendKeys("sachin@gmail.com");
			Thread.sleep(2000);
			passwordField.sendKeys("sachin1234");
			Thread.sleep(2000);
			driver.quit();
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
			}
}
