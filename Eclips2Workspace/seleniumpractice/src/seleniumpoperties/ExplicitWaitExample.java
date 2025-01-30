package seleniumpoperties;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
	
	public static void main(String [] args) {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(3000);
		driver.get(	"https://opensourcedemo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 
		 WebDriver username= wait.until(ExpectedCondition.visibilityOfElemented(By.name("username")));
		username.sendKeys("Admin");
		
	}catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	}

}
