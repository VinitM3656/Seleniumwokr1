package Practice99;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class AlertBox {
	public static void main(String [] args) {
		try {
			//WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("D:\\MOVIES\\Selenium-LATEST\\alert.html");
			Thread.sleep(3000);
			driver.findElement(By.id("alert")).click();
			Alert a = driver.switchTo().alert();
			Thread.sleep(3000);
			String text = a.getText();
			System.out.println(" the text is "+text);
			a.accept();
			Thread.sleep(2000);
			driver.quit();
			
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
				
			}
			}
			}
