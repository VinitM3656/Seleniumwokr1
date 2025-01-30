import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNumber {
	
	public static void main(String [] args) {
		
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			driver.get(" https://wwww.facebook.com");
			Thread.sleep(3000);
			
			WebElement emailfield = driver.findElement(By.className("inputtext"));
			
			WebElement passfield = driver.findElement(By.className("_9npi"));
			
			emailfield.sendKeys("vinit@gmail.com");
			passfield.sendKeys("vinit@123");
			driver.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
