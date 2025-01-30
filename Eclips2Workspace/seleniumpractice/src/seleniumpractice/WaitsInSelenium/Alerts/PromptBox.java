package seleniumpractice.WaitsInSelenium.Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptBox {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("D:\\MOVIES\\Selenium-LATEST\\alert.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	driver.findElement(By.id("prompt")).clear();
	Alert a = driver.switchTo().alert();
	Thread.sleep(2000);
	String text = a.getText();
	System.out.println(" the text is "+text);
	a.sendKeys("Hello prompt how are you");
	Thread.sleep(2000);
	a.accept();
	Thread.sleep(2000);
	driver.quit();
	
	
	
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
