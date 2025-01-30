import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		try {
			 WebDriver driver = new ChromeDriver();
			 Thread.sleep(1000);
			 driver.manage().window().maximize();
			 Thread.sleep(1000);
			 driver.get("www.facebook.com");
			 Thread.sleep(1000);
			 WebElement emailField = driver.findElement(By.name("email"));
			 emailField.sendKeys("mhetrevinit@gmail.com");
			 WebElement continueButton = driver.findElement(By.id("continue"));
		        continueButton.click();
			 
			 WebElement passwordField = driver.findElement(By.id("ap_password"));
		        passwordField.sendKeys("Vinit@123");
			 
		        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
		        signInButton.click();

			 Thread.sleep(1000);
			// passwordField.sendKeys("Sachine12345");
			// Thread.sleep(1000);
			 driver.close();
			 
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
		

}
