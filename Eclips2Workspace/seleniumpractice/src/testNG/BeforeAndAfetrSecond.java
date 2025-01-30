package testNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAndAfetrSecond {
	
	ChromeDriver driver;
	
	void beforeMethod() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com");
		
	}
	catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
		
	}


}
