import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	
	public static void main(String [] args) {
		
		try {
			
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement emailfield = driver.findElement(By.name("email"));
		
		WebElement passfield = driver.findElement(By.name("pass"));
		
		
		Thread.sleep(1000);
		
		
		emailfield.sendKeys("vinitbhetre@gmail.com");
		Thread.sleep(2000);
		
		passfield.sendKeys("vinit@123");
		
		Thread.sleep(2000);
		driver.close();
		
		
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			}
	}

}
