import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkLocator {

	public static void main(String[] args) {
		try{
			WebDriver driver = new ChromeDriver();
			Thread.sleep(4000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com");
			Thread.sleep(3000);
			WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("Forgotten"));
			Thread.sleep(3000);
			driver.close();
			
		}catch (Exception e) {
			System.out.println("e.getMessage()");
			
		} 

	}

}
