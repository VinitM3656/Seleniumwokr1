package seleniumpoperties;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutExample {
	
	public static void main(String [] arg) {
		try {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
			
			driver.get("https://opensourcedemo.orangehrmlive.com/web/index.php/auth/login");
		
			
			
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		String gettitle = driver.getTitle();
		String getUrl = driver.getCurrentUrl();
		String Pagesource = driver.getPageSource();
		
		System.out.println(" wehaving all "+" "+ gettitle+" "+ getUrl+" "+ Pagesource);
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
