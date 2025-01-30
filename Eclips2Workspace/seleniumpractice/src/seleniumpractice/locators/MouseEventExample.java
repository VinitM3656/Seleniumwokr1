package seleniumpractice.locators;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventExample {
	
	public static void main(String [] args) {
		try {
			
			
			ChromeDriver Driver = new ChromeDriver();
			Thread.sleep(4000);
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Driver.get("https://www.edureka.co/");
			Thread.sleep(2000);
			
			WebElement browseCategories=Driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-sm ga_browse_top_cat']//span[contains(text(),'Courses')]"));
			WebElement frontEndDevelopement=Driver.findElement(By.xpath("//a[@class='dropdown-toggle ga_top_category'][normalize-space()='Frontend Development']"));
			WebElement angularDevelopment=Driver.findElement(By.xpath("//a[contains(@class,'ga_top_categories_course')][normalize-space()='Angular Certification Course Online']"));
			Actions a = new Actions(Driver);
			a.moveToElement(browseCategories).perform();
			a.pause(Duration.ofSeconds(2));
			
			a.moveToElement(frontEndDevelopement).perform();
			
			a.pause(Duration.ofSeconds(2));
			a.moveToElement(angularDevelopment).perform();
			
			a.pause(Duration.ofSeconds(3));
			a.click().perform();
			Thread.sleep(2000);
			Driver.quit();
			
			
			
		}catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}
	}

}
