package SeleniumRevision;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutExample {
	public static void main(String [] args) {
		try {
			
			
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(5000);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSecond(2));
			driver.get("https://opensource-demo.orangeHRM);
		}
	}
