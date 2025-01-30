import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class NavigationCommands {

	public static void main(String[] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
;
			Thread.sleep(3000);
		((RemoteWebDriver) driver).manage().window().maximize();
		Thread.sleep(2000);
		
		((WebDriver) driver).get("https://www.google.com");
	Thread.sleep(2000);
		WebElement forgotPassword = driver.findElement(By.linkText("Forgotten password?")); 
		
		forgotPassword.click();
		Thread.sleep(3000);
	   driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.close();
		}catch (Exception e) {
			System.out.println();
		}

	}

}
