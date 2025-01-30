package Prachi;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWAIT {
	
	public static void main(String [] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.in");
		
		// wait for 10 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Stopwatch watch = null;
		
		try {
			
			
			watch = Stopwatch.createStarted();
			//find webelemtn
			driver.findElement(By.linkText("STAR SELLING")).click();
			
		}
		catch(Exception e) {
			
			
			watch.stop();
			System.out.println(e);
			
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
			
		}
			
	}

}
