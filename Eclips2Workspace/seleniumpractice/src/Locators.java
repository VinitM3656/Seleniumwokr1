import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com");
			Thread.sleep(3000);
			
			WebElement emailfield = driver.findElement(By.cssSelector("input#email"));
			WebElement passfield = driver.findElement(By.className("input#pass"));
			emailfield.sendKeys("vinit@gmail.com");
			Thread.sleep(2000);
			
			passfield.sendKeys("vinit@123");
			
			Thread.sleep(2000);
			
			
			driver.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
