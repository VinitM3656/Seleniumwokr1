package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.chrome.ChromeDriver;

public class SourceCode {

	public static void main(String[] args) {
		try {
		//	WebDriver driverr = new.Chromedriver();
		 WebDriver driver = new ChromeDriver();
			//ChromeDriver driver = new ChromeDriver();
			Thread.sleep(5000);
			driver.get("https://www.amazon.in/");
			String sourceCode = driver.getPageSource();
			System.out.println("The source code is"+sourceCode);
			
		}catch (Exception e) {
			System.out.println("e.getMessage()");
		}

	}

}

