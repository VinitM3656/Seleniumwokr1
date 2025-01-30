import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceCode {

	public static void main(String[] args) {
		try {
		//	WebDriver driverr = new.Chromedriver();
		 WebDriver driver = new ChromeDriver();
			//ChromeDriver driver = new ChromeDriver();
			Thread.sleep(5000);
			driver.get("https://www.youtube.com/watch?v=jzD_yyEcp0M");
			String sourceCode = driver.getPageSource();
			System.out.println("The source code is"+sourceCode);
			
		}catch (Exception e) {
			System.out.println("e.getMessage()");
		}

	}

}
