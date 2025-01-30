package seleniumpractice.locators;

import org.bouncycastle.openssl.PasswordFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS2 {
	public static void main(String[] args) {
		try {
		//bDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		WebElement emailField =
		driver.findElement(By.cssSelector("input.inputtext")
		);
		Thread.sleep(3000);
		emailField.sendKeys("sachin@gmail.com");
		WebElement passwordField =
		driver.findElement(By.cssSelector("input._9npi"));
		Thread.sleep(3000);
		passwordField.sendKeys("sachin1234");
		Thread.sleep(2000);
		driver.close();
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		}
		}