package Prachi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseElement {
	
	
	public static void main(String [] args) {
	try {	
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.edureka.co/");
		 Thread.sleep(10000);
		 WebElement browseCategories =
		 driver.findElement(By.xpath( "//a[@class='dropdown-toggle hidden-xs hidden-smga_browse_top_cat']//span[contains(text(),'Categori es')]"));
		 WebElement frontEndDevelopment =
		 driver.findElement(By.xpath( "//a[contains(@class,'dropdown-toggle ga_top_category')][normalize-space()='Frontend Development']"));
		 WebElement angularDevelopment =
		 driver.findElement(By.xpath( "//a[@class='ga_top_categories_course'][normalizespace()='Angular Certification Training Course']"));
		 Actions a = new Actions(driver);
		 a.moveToElement(browseCategories).perform();
		 a.pause(Duration.ofSeconds(3));
		 a.moveToElement(frontEndDevelopment).perform();
		 a.pause(Duration.ofSeconds(3));
		 a.moveToElement(angularDevelopment).perform();
		 a.pause(Duration.ofSeconds(3));
		 a.click().perform();
		 Thread.sleep(3000);
		 driver.quit();
		 } catch (Exception e) {
		 System.out.println(e.getMessage());
		 }
		 }
		 }
