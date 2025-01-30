package Practice99.Frames.MouceEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouceEvents {
	public static void main(String [] args) {
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(4000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.edureka.co/");
			Thread.sleep(3000);
			WebElement browseCatergories=driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-smga_browse_top_cat']//span[contains(text(),'Categories')]"));
			
			WebElement frondEndDevelopment= driver.findElement(By.xpath("\"//a[contains(@class,'dropdown-toggle\r\n"+ "ga_top_category')][normalize-space()='Frontend\r\n"+"Development']\"));"
		Actions a = new Actions(driver);
					a.moveToElement(browseCatergories).perform();
		
					a.pause(Duration.ofSeconds(3));
					a.moveToElement(browseCatergories).perform();
	}

}
