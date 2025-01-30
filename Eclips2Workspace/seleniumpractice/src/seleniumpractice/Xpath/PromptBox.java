package seleniumpractice.Xpath;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptBox {
	
	public static void main(String[] args) {
		
		try {
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("file:///D:/MOVIES/Selenium-LATEST/alert.html"); // Assuming alert.html is a local file
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(3000);
			driver.findElement(By.id("prompt")).click(); // Click on prompt button
			Alert a = driver.switchTo().alert();
			Thread.sleep(2000);
			String text = a.getText();
			System.out.println("The text is " + text);
			a.sendKeys("Hello prompt, how are you"); // Sending keys to the prompt
			Thread.sleep(2000);
			a.accept(); // Accept the prompt
			Thread.sleep(2000);
			driver.quit(); // Quit the browser
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
