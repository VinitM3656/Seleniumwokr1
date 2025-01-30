package AutomationCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouceevent {
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 driver.get(" https:// www.edurekha.com");
			 Thread.sleep(2000);
			 WebElement browserCategories=driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-smga_browse_top_cat']//span[contains(text(),'Categores')]"));
			 
			 WebElement frontEndDevelopement=driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle ga_top_category')][normalize-space()='FrontendDevelopment']"));
			 
			 Actions a = new Actions(driver);
			 a.moveToElement(frontEndDevelopement).perform();
			a.pause(Duration.ofSeconds(3));
		a.moveToElement(frontEndDevelopement).perform();
		a.pause(Duration.ofSeconds(2));
		a.moveToElement(browserCategories).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
