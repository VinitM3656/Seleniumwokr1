package Saucedemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MinimizeWebPage {

	public static void main(String[] args) {
		try {
			 WebDriver driver = new ChromeDriver();
			Thread.sleep(1000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(1000);
			
			driver.manage().window().minimize();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

		}


	}

