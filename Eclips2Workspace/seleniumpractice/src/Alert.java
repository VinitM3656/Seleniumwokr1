import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("Desktop\\untitled.html");
			
			Thread.sleep(2000);
			WebElement pagelink= driver.findElement(By.linkText("Click here for page"));
		
		pagelink.click();	
			
			
			Set<String> allIds = driver.getWindowHandles();
			ArrayList<String> al = new ArrayList<String>(allIds);
			System.out.println(al.get(1));
			driver.switchTo().window(al.get(1));
			driver.findElement(By.linkText("Click here for page3")).click();
			Thread.sleep(3000);
			driver.quit();
			} catch (Exception e) {
			System.out.println(e.getMessage());
			
			
			}
	}
}

			

			
			
	