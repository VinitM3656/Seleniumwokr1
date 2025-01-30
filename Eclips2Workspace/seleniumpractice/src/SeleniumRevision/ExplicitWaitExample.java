package SeleniumRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
	
public static void main(String [] args) {
	
	ChromeDriver driver = new ChromeDriver();
	
	Thread.sleep(4000);
	
	driver.manage().window().maximize();
	driver.get("https://orangehrmlive.com/web/index.php/auth/login");
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
WebElement userName = wait.until(ExpectedCondition.visibilityOfElementLocated(By.name("userName"));

userName.sendKeys("Admin");

}catch(Exception e) {
	System.out.println(e.getLocalizedMessage());
}
