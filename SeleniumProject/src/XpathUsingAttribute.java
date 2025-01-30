import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;

public class XpathUsingAttribute {

	public static void main(String[] args) {
		try {
			//WebDriverManager.chromeDriver().setup();
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.get("https://amazon.com");
			Thread.sleep(3000);
WebElement emailField = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));	
WebElement passwordField = driver.findElement(By.xpath("input[@data-testid='royal_pass']"));
emailField.sendKeys("mhetrevinit@gmail.com");
Thread.sleep(2000);
passwordField.sendKeys("Vinit@123");


		Thread.sleep(2000);
		driver.quit();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	

	}
	}
}


	


