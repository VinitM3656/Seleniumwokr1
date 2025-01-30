package seleniumpoperties;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class KeyWordDrivenFramework {
	
	public static void main(String [] args) {
		
		try {
			
			ChromeDriver driver = new Chromedriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			FileInputStream fis = new FileInputStream()
		}
	}

}
