import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrom.ChromDriver;
import io.github.bonigarcia.wdm.WebDriverManager
public class NavigationCommand {
public static void main(String[]args) {
	try {
		WebDriverManager.chromedriver().setup
		ChromeDriver Driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		WebElement ForgotPassword = driver.findElement(By.linkText("Forgotten password?"));
		forgotPassword.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.close();
	}
	catch(exception e) {
		System.out.println(e.getMessage());
	}
}
}
