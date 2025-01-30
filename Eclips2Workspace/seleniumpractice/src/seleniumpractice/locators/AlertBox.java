package seleniumpractice.locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			driver.get("D:\\Eclips\\Eclips2Workspace\\CucumberJava\\file.html");
			Thread.sleep(3000);
			driver.findElement(By.id("confirm")).click();
			Alert a = driver.switchTo().alert();
			Thread.sleep(3000);
			String text = a.getText();
			System.out.println(" the text is "+ text);
			a.accept();
			Thread.sleep(3000);
			driver.quit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
