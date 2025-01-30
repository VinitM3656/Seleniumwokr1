package seleniumpractice.WaitsInSelenium.Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
		Thread.sleep(2000);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("D:\\MOVIES\\Selenium-LATEST\\alert.html");
		driver.findElement(By.id("alert")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		String Text = a.getText();
		System.out.println(" the text is "+Text);
		a.accept();
		Thread.sleep(3000);
		driver.quit();
		}
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		
		
		
		}
		
	}

}
