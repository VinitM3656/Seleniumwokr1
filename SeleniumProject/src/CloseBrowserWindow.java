import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowserWindow {

	public static void main(String[] args) {
		try {
			WebDriver driver = new ChromeDriver();
			//ChromeDriver driver = new ChromeDriver();
			Thread.sleep(5000);
			driver.get("https://www.google.com");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
		}
		
		
		
		
		
		catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
