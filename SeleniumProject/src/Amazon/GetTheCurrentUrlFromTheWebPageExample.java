package Amazon;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTheCurrentUrlFromTheWebPageExample {

	public static void main(String[] args) {
		try {
			WebDriver driver = new ChromeDriver();
			ChromeDriver driver1 = new ChromeDriver();
			Thread .sleep(3000);
			driver1.get("https://www.amazon.in/mobile-phones/b?ie=UTF8&node=1389401031");
			String currentURL =driver1.getCurrentUrl();
			System.out.println("Current URL -"+currentURL);
		}
catch(Exception e) {
	System.out.println("e.getMessage");
}
	}

}
