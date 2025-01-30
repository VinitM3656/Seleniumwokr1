import org.open.selenium.chrome.ChromeDriver;
import Io.github.bonigarcia.wdm.WebDriverManager;

public class GetTheCurrentUrl {
	public static void main(String[] args) {
		try {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver =new ChromeDriver();
			Thread.sleep(6000);
			driver.Get("https://www.amazon.in/");
			String currentURL = driver.getCurrentUrl();
			System.out.println("Current URL  -"+currentURL);}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
	}

}

