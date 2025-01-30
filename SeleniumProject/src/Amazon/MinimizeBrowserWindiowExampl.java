package Amazon;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MinimizeBrowserWindiowExampl {

	public static void main(String[] args) {
		try {
			 WebDriver driver = new ChromeDriver();
			Thread.sleep(1000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.get("https://www.Amazon.com");
			
			 WebElement continueButton = driver.findElement(By.id("continue"));
		        continueButton.click();

			Thread.sleep(1000);
			
			driver.manage().window().minimize();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

		}


	}

