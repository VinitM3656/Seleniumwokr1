package seleniumpractice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class MaximizeandMinimize {
	
public static void main(String [] args) {
	
	try {
		
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		String sourcecode= driver.getPageSource();
		System.out.println(" current source code"+sourcecode);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.close();
	}
	catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
		
	}
	}
}