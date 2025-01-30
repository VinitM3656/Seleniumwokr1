import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		try {
			//WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//WebDriverWait wait = new WebDriver.Wait(driver, Duration.ofSeconds(10));
	//	WebElement userName = wait.until(ExpectedCondition.visibilityOfElementLocated(By.name("username")));
		//userName.sendKeys("Admin");
		
		
	
			
			
	} catch(Exception e) {
		System.out.println(e.getMessage());
		
	}}

}

	

	


