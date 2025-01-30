
package Saucedemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocators{

	public static void main(String[] args) {
		try {
			 WebDriver driver = new ChromeDriver();
			 Thread.sleep(1000);
			 driver.manage().window().maximize();
			 Thread.sleep(1000);
			 driver.get("https://www.saucedemo.com/");
			 Thread.sleep(1000);
			 WebElement UsernameField = driver.findElement(By.name("Username"));
		
			 WebElement passwordField = driver.findElement(By.name("password"));
			 UsernameField.sendKeys("performance_glitch_user");
			 Thread.sleep(1000);
			 passwordField.sendKeys("Ssecret_sauce");
			 Thread.sleep(1000);
			 driver.close();
			 
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
		

}
