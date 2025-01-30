package seleniumpoperties;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {
	
	
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			
			String gettiltle = driver.getTitle();
			
			String getUrl = driver.getCurrentUrl();
			
			String PageSource = driver.getPageSource();
			
			System.out.println(" we having the data"+getUrl+" "+ gettiltle+" "+PageSource);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("C:\\Users\\vinit\\Desktop\\Old Firefox Data\\j1o3lxfa.default-1692292812941\\file.html");
					
				Thread.sleep(2000);
				driver.findElement(By.id("confirm")).click();
				Alert a= driver.switchTo().alert();
				Thread.sleep(2000);
				
				String text = a.getText();
				System.out.println(" the text is "+text);
				
				a.accept();
				
				Thread.sleep(3000);
				driver.quit();
				
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
